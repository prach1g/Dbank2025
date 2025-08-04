import React from "react";

export default class ClassLifeCycle extends React.Component
{
    constructor()
    {
        super()
    }

    componentDidMount(){
        console.log("The class lifecycle example has mounted")
    }

    componentDidUpdate(){
         console.log("The class lifecycle was updated")

    }

    componentWillUnmount()
    {
            console.log("The class lifecycle example is about to be unmounted")
    }

    render()
    {
        return(<>
        <h4>ClassLifeCycle Component</h4>
        <p>{this.props.value}</p>
        </>)
    }
}
