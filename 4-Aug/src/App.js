import Idcard from "./Idcard";
import Today from "./Today";
import SH from "./SayHello";  //giving alias to sayHello

function App() {
   let x = <h1>Welcome to react</h1> 
   console.log("typeofx",typeof(x))

   let uname="prachi"

  return (
         <>
         <h1>Welcome {uname} to react</h1>
         <Today format_value={"2"}></Today>

        <SH></SH>

         <Idcard uname={"prachi g"}></Idcard>
         <Idcard uname={"sachin t"}></Idcard>
         <Idcard uname={"rahul d"}></Idcard>
         <p>This is the app component { uname.toUpperCase()}</p>
         <p>{2+3 *9 }  { "hello" +"world"}</p>
         </>
  )
}

export default App;
