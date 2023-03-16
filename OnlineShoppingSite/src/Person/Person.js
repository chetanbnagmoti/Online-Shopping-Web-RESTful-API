import "./Person.css";
 //componet creteted here and exported in index.js 
function Person(props) {
    return (
      <div className="item">
        <h2>{props.name}</h2>
        <p><b>Title:</b>{props.title}</p>
      </div>
    );
  } 
  
  
  
  
  export default Person;