 //props are collected using destructuring syntax
 const Calculator = ({num1,num2,op})=>{

    let styleobj ={border:"1px solid blue",padding:"5px",width:"fit-content", height:"fit-content"}
    let result = 0
    switch(op)
    {
        case "+" : result = parseInt(num1) + parseInt(num2); break
        case "-" : result = num1 - num2; break
        case "*" : result = num1 * num2; break
        case "/" : result = num1 / num2; break
        default : break
    }

     return (
      <div style={styleobj}>
       <h5>Calculator</h5>
       <p> {num1} {op} {num2} = {result }</p>
     </div>)
}

export default Calculator


//this will add a feature of decorating the component  
function decorator(Comp)   //Comp is any other component that should get the feature
{
    //HOC is the WRAPPER  -- Comp is the Wrapped component
    return function HOC(props){   //returning a new component that wraps the existing component
     return (
        <>
        <p>*****************</p>
         <Comp {...props}></Comp>
        <p>*****************</p>
        </>
     )
    }
}

export const DecoComp = decorator(Calculator)
