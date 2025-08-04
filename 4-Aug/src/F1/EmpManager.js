import { useState } from "react"
import AddEmp from "./AddEmp"
import V1 from "./AddEmp"
import UpdateEmp from "./UpdateEmp"

const EmpManager=()=>{

    let [objToBeUpdated , setobj ] =useState({empId:"NA",empName:"NA",dept:"NA"})
    let  [employees,setemployees] = useState( [ {empId:1,empName:"prachi",dept:"training"},
                      {empId:2,empName:"preeti",dept:"testing"},
                     ]  )

    let [addflag,setaddflag] = useState(false)

    function addEmpToArr(empobj)
    {
        //employees.push(empobj)  //append
       // employees.splice(3,0,empobj)  //insert
       //  employees[3] = empobj //overwrite

        //setemployees(employees) // CHANGE DETECTION WILL FAIL HERE
                                //  the reference of the array before and after is same 
                                //objects are compared by reference
                                //NO RERENDERING

        //setemployees([...employees])    
        
        let temp = [...employees]  //We need to give a copy as we need a new reference
                                    // then before and after references are different
                                    //CHANGE DETECTION detects change  = RERENDER happens
        temp.push(empobj)
        setemployees(temp)
        
        
    }

    
    function updateEmp(emp)
    {
       let i = employees.findIndex((e)=>{ if(e.empId== emp.empId) return true})
       employees[i] = emp  //update the ith element to new employee
       setemployees([...employees])
    }



    return(
        <>
        <h5>EmpManager</h5>
        <table>
            <thead><tr><th>id</th><th>name</th><th>dept</th></tr></thead>
            <tbody>
            { employees.map((emp,index)=>{ return <tr key={emp.empId}>
                                                     <td>{emp.empId}</td>
                                                     <td>{emp.empName}</td>
                                                     <td>{emp.dept}</td>
                                                     <td><input type="button" value="update" 
                                                     onClick={()=>{setobj(emp)}} /> </td>
                                                 </tr>})}

            </tbody>
        </table>
        
        <p>Add NEW  <input type="checkbox" onChange={(event)=>{setaddflag(event.target.checked)}}/></p>
        {addflag && <AddEmp liftUp={addEmpToArr}></AddEmp> }
        
        <UpdateEmp objToBeUpdated={objToBeUpdated}  update={updateEmp} ></UpdateEmp>
        </>
    )


}

export default EmpManager