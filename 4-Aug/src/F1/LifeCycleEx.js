import { useState } from "react"
import ClassLifeCycle from "./ClassLifeCycle"
import FunctionalLifeCycle from "./FucntionalLifeCycle"

const LifeCycleEx = ()=>{

     let[flag,setflag] = useState(false)
    let [ val,setval] = useState("")

      return(<>
        <h4>LifeCycleEx</h4>
        
        <input type="text" onChange={(event)=>{setval(event.target.value)}}  />
        <input type="checkbox" onChange={(event)=>{setflag(event.target.checked)}}  />

        { flag && <ClassLifeCycle value={val}></ClassLifeCycle> }

        <hr></hr>

        {flag && <FunctionalLifeCycle value={val}></FunctionalLifeCycle>}


      </>)

}

export default LifeCycleEx