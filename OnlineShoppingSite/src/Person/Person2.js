import React, { Component } from "react";
import "./Person.css";
//Class ka phanda used kiya hey ya ha pe.
class Person2 extends Component {
    render(){
        return (
            <div className="item">
              <h2>{this.props.name}</h2>
              <p><b>Title:</b>{this.props.title}</p>
            </div>
          );
    } 

}
export default Person2;