import axios from "axios"
import { useState } from "react"
export default function AjaxEx(){
    let [obj,setobj] = useState({first_name:"",last_name:"",id:"",email:"",avatar:""})
    let id = 0

    let handler =()=>{
        let p =axios.get(`https://reqres.in/api/users/${id}`,
                 {headers:{"x-api-key": "reqres-free-v1"}})

                 

        p.then((response)=>{ setobj(response.data.data)},(error)=>{ console.log(error)})
    }


    return(<>
    <h3>Ajax Ex</h3>
    <input type="number"  onChange={(event)=>{ id =event.target.value}} />
    <input type="button" value="get data" 
      onClick={handler} />

        <p>{obj.first_name} {obj.last_name}</p>
        <p>{obj.id}</p>
        <p>{obj.email}</p>
        <p><img src={obj.avatar} width={100} height={100} /></p>

    </>)
}