import { useEffect } from "react"

const FunctionalLifeCycle = ({value})=>{

    //maps to componentDidMount
    //use effect with empty second parameter = called just after mount
   useEffect(()=>{
       console.log("functional component is mounted")
   },[])


   //maps to componenWillUnmount
   //use effect with the callback funciton returning another callback 
   //called just before UNMOUNTING
   useEffect(()=>{
         return ()=>{ console.log("functional component is about to be unmounted")}
   },[])


   //maps to componentDidUpdate
   //called every time the value changed
   useEffect(()=>{
    console.log("the value changed",value)

   },[value])





    return (<>
          <h6>Functional LifeCycle</h6>
          <p>{value}</p>
    </>)


}

export default FunctionalLifeCycle