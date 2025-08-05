import React, { useReducer } from 'react';

//  Define the reducer function
function counterReducer(state={count:0}, action) {  //action = { type:"increment"}
  switch (action.type) {
    case 'increment':
      return { ...state, count: state.count + 1 };  //VERY IMP TO RETURN NEW OBJECT
    case 'decrement':
      return { count: state.count - 1 };
    case 'reset':
      return { count: 0 };
    default:
      return state   //NO RERENDER will happen 
      //throw new Error(`Unknown action type: ${action.type}`);
  }
}

// Component using useReducer
export default function Counter() {
  // useReducer(reducer, initialState)
  const [state, dispatch] = useReducer(counterReducer, { count: 0 });

  return (
    <div style={{ fontFamily: 'sans-serif' }}>
      <h2>Count: {state.count}</h2>
      <button onClick={() => dispatch({ type: 'increment' })}>➕ Increment</button>
      <button onClick={() => dispatch({ type: 'decrement' })}>➖ Decrement</button>
      <button onClick={() => dispatch({ type: 'reset' })}>🔁 Reset</button>
    </div>
  );
}
