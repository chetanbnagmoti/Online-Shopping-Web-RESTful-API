import logo from './logo.svg';
import './App.css';
//App is commonet.
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Welcom <b>TO React -</b>"I am chetan"
        </p>
        <p>I will used first time React App In Manasi Laptop.</p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;
