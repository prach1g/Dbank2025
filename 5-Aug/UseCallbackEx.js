import React, { useCallback, useState } from 'react';

const Child = React.memo(({ onClick }) => {
  console.log('Child rendered');
  return <button onClick={onClick}>Click Me</button>;
});

export default function UseCallbackEx() {
  const [count, setCount] = useState(0);


  //even though Child is wrapped with React.memo, it still re-renders when count changes — because a new handleClick function is created on every render.
  const handleClick = useCallback(() => {
    console.log('Button clicked');
  },[]); 
  /*
  const handleClick = () => {
    console.log('Button clicked');
  }*/

  return (
    <div>
      <h2>Count: {count}</h2>
      <Child onClick={handleClick} />
      <button onClick={() => setCount(c => c + 1)}>Increment Count</button>
    </div>
  );
}
