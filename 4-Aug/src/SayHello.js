import { useState } from "react"

function SayHello()
{
    let [num , setnum] = useState(0)
    let [uname,setuname] = useState("YET TO BE GIVEN")
    //let num = 0;
    //let uname="YET TO BE GIVEN"
    let handler = ()=>{  //console.log("hello" ,uname,  ++num)
        setnum(++num)
    }
    let handler2=(event)=>{ 
       // uname =event.target.value
       setuname(event.target.value)

    }

    return(
        <>
        <input type="text" placeholder="Enter a name"  onBlur={handler2}/>
        <input type="button" value="Say hello" onClick={handler} />
        <p>Hello {uname} {++num} </p>
        </>
    )
}

export default SayHello