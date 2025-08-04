import React from "react"
import "./styleone.css"
import myimg from "./logo.svg"

class Idcard extends React.Component
{
    constructor()
    {
        super()
    }

    //callback function =  React will call this function 
    render()
    {
        return (
            <div style={{border:"1px solid blue"}}  className="alpha">
          <h3>Idcard</h3>
          <p>Name :  {this.props.uname} </p>
          {/* <img src="logo192.png" width={100}  height={100}/> */}
          <img src={myimg} width={100}  height={100} alt="not found" />
        </div>)
    }

}

export default Idcard