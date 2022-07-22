
import {useState} from "react";


export default function HookExample() {
  const [count, setCount] = useState(0);


  const incrementCounter = () => {
    setCount(count + 1);

  }

  return (
    <div>
      <p>You clicked {count} times</p>
      <button onClick= {incrementCounter}>
        Increment
      </button>
    </div>
  );
}