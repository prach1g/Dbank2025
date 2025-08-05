import { BrowserRouter, Route, Routes } from "react-router-dom";
import LifeCycleEx from "./F1/LifeCycleEx";
import InputComp from "./F1/InputComp";
import Home1 from "./F1/Home";
import UseMemoEx from "./F2/UseMemoEx";
import UseCallbackEx from "./F2/UseCallbackEx";
import Counter from "./F2/UseReducerEx";

export default function AppRoute2()
{

    return(
        <BrowserRouter>
          <Routes>
                    <Route path="/" element={<Home1 />}>
                    <Route path="lifecycle" element={<LifeCycleEx/>}></Route>
                    <Route path="calc" element={<InputComp />}></Route>
                    <Route path="memoex" element={<UseMemoEx />}></Route>
                    <Route path="cbex" element={<UseCallbackEx />}></Route>
                    <Route path="reducerex" element={<Counter />}></Route>
                    </Route>
           </Routes>
        </BrowserRouter>
    )
}





