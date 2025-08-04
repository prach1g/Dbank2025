import { useState } from "react";
import Calculator, { DecoComp } from "./Calculator";

export default function InputComp()
{
      let [num1,setnum1] = useState(0)
      let [num2,setnum2] = useState(0)
      let [op,setop] = useState("+")
      let [show,setshow] = useState(false)

      /*
     if(show)
        return ()
      else
        return () */

     return (<>
        <h4>Input Comp</h4>
        <input placeholder="Enter num1" type="number" 
                onChange={ (event)=>{ setnum1(event.target.value)}}
               ></input>
        <input placeholder="Enter num2" type="number"
        onChange={ (event)=>{ setnum2(event.target.value)}}
        ></input>
        <select onChange={ (event)=>{ setop(event.target.value)}}>
            <option>+</option>
            <option>-</option>
            <option>*</option>
            <option>/</option>
        </select>

        <p>Show Decorated Calculator Output : <input type="checkbox" 
                                        onClick={ (event)=>{ 
                                            //console.log(event.target.checked)
                                            setshow(event.target.checked)}
                                            } 
                                     /> </p>
            <p>Show = {show+""}</p>
        {/* {show ?<Calculator num1={num1} num2={num2} op={op}></Calculator>:<p>OUTPUT is DISABLED</p> } */}
{/* 
        {show && <Calculator num1={num1} num2={num2} op={op}></Calculator>}
        {show==false && <p>OUTPUT is DISABLED</p>} */}

        {show ? <DecoComp num1={num1} num2={num2} op={op}></DecoComp> : <Calculator num1={num1} num2={num2} op={op}></Calculator> }

     </>)
}