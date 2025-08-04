import { memo } from "react"

const AddEmp = ({liftUp})=>{

    console.log("rerendered")
    let  empId,empName,dept
    

    let handler=()=>{
        let obj = {empId,empName,dept}
        console.log("button clicked ",obj)
        liftUp(obj)  // pass this to the funciton of the outer component 
    }


    return(<>
        <h6>AddEmp</h6>
        <p><input type="text" placeholder="Enter id"
                    onChange={(event)=>{ empId = event.target.value}}/></p>
        <p><input type="text" placeholder="Enter name"
                    onChange={(event)=>{ empName = event.target.value}}
        /></p>
        <p><input type="text"  placeholder="Enter department"
                    onChange={(event)=>{ dept = event.target.value}}
        /></p>
        <p><input type="button" value="add new employee"
                  onClick={handler}
                     /></p>

    </>)
}

//const V1 = memo(AddEmp)
export default AddEmp