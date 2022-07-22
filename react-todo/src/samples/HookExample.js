
import {useState} from "react";


export default function HookExample() {
  const [count, setCount] = useState(0);


  const incrementCounter = () => {
    setCount(count + 1);

  }

  const decrementCounter = () => {
    setCount(count - 1);
  }

  return (
    <div>
      <p>Counter value is {count}</p>
      <button onClick= {incrementCounter}>
        Increment
      </button>
      <button onClick= {decrementCounter}>
        Decrement
        </button>

    </div>
  );
}