//function Today() {  }
const Today = (props) => {
    
      let d = new Date()
      let date =d.getDate()
      //the month starts from 0
      let month = d.getMonth() + 1
      let year = d.getFullYear();

      let str=""
      if(props.format_value == "1")
        str = `${date}-${month}-${year}`
      if(props.format_value == "2")
        str = `${date}/${month}/${year}`

      return (
           <div style={{color:"red", backgroundColor : "aqua"}}>
           <p>Today is {str}</p>
           </div>
      )

} 

export default Today
