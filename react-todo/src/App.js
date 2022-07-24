import './App.css';
import HookExample from './samples/HookExample';
import PersonalSetter from './samples/PersonalSetter';


// https://www.npmjs.com/package/react-hooks-global-state


function App() {
  return (
    <div className="App">
      <PersonalSetter />
      <HookExample/>
    </div>
  );
}

export default App;
