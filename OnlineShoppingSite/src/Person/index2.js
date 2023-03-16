import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
// import Person from './Person/Person';
import Person2 from './Person/Person2';
import reportWebVitals from './reportWebVitals';

// var app=(
//   <div>
//     <Person name="chetan nagmoti"  title="Happy" />
//     <Person  name="Mansi Nagmoti" title="Kahtrnak"/>
//     <Person  name="Rutuja Deshmukh" title="Sad"/>
//     </div>
//   );

var app=(
    <div>
      <Person2 name="chetan nagmoti"  title="Happy" />
      <Person2 name="Mansi Nagmoti" title="Kahtrnak"/>
      <Person2 name="Rutuja Deshmukh" title="Sad"/>
      </div>
    );

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(app);



