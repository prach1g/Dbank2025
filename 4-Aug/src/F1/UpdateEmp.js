import { useEffect, useState } from "react"

const UpdateEmp = ({objToBeUpdated,update})=>{

    // let [id,setid] = useState(12)
    // let [name,setname] = useState("prachi")
    // let [dept,setdept] = useState("training")
      const [formData, setFormData] = useState({empName: '',empId: '',dept: '',});

    useEffect(() => {
    setFormData({
        empId : objToBeUpdated.empId,
        empName: objToBeUpdated.empName,
        dept: objToBeUpdated.dept,
    });
  }, [objToBeUpdated]);

    let handler = (event)=>{
        event.preventDefault()  //we do not want to go to another page 
        update(formData)  // lifting state
    }

const handleChange = (e) => {
    const { name, value } = e.target;  //html element on which the event has occured
    setFormData(prev => ({ ...prev, [name]: value }));
  };


    return(<>
      <h6>Update Emp</h6>
      {/* <p><input type="text" value={id} onChange={(event)=>{setid(event.target.value)}}/></p> */}
      <form onSubmit={handler}>
      <p><input type="text" name="empId" value={formData.empId} readOnly /></p>
      <p><input type="text" name="empName" value={formData.empName} onChange={(event)=>{
           setFormData({...formData,empName:event.target.value})
      }} /></p>
      <p><input type="text" name="dept" value={formData.dept} onChange={
          (event)=>{setFormData({...formData,dept:event.target.value})}
      }/></p>
      <p><input type="submit" value="update" /></p>
      </form>
    </>)
}

export default UpdateEmp