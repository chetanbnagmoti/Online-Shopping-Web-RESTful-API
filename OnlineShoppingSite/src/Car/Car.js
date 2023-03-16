import React, { Component } from "react";

class Car extends Component{
    constructor(props){
        super(props);
        this.state={
            brand:"Ford",
            model:"Mustang",
            colore:"red",
            year:1964
        };
    }

    chageColor = () => {
        this.setState({colore:"blue"});     //setState():-For chagne of existing state.
    }

//render method fot HTML:-
    render(){
        return(
            <div> 
                <h1>
                    My {this.state.brand}
                </h1>
                <p>It Is a {this.state.model} from
                {this.state.year} & color is {this.state.colore}.</p>

                <button type="button "onClick={this.chageColor}>Change color</button>
            </div>
        );
    };
};

export default Car;