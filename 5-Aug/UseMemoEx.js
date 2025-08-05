import React, { useMemo, useState } from 'react';

function factorial(n) {
  console.log('Calculating factorial...');
  if (n <= 0) return 1;
  return n * factorial(n - 1);
}

export default function UseMemoEx() {
  const [number, setNumber] = useState(5);
  const [otherState, setOtherState] = useState(false);

  const fact = useMemo(()=>{return factorial(number)},[number]); //the return is imp
 // const fact = factorial(number); // re-runs on every render

  return (
    <div>
      <h2>Factorial of {number} is {fact}</h2>
      <button onClick={() => setNumber(number + 1)}>Increase</button>
      <button onClick={() => setOtherState(!otherState)}>Toggle Other State</button>
    </div>
  );
}
