const ListEx=()=>{

       let groceries= ["salt","pepper","sugar","butter","tea"]

        function getList()
        {
            let jsxarr = groceries.map((item,index)=>{
                 return <li key={'alist'+item+index}>{item}</li>
            })

            return jsxarr
        }

       return(<>
         <h6>List Ex</h6>
         <ol >
            {getList()}
         </ol>

         <ul>
            { groceries.map((item,index)=>{ return <li key={'blist'+item+index}>{item}</li>})}
         </ul>

         <div>
            {groceries.map((item,index)=>{ return <p key={'clist'+index}>{item}</p>})}
         </div>

       </>)

}


export default ListEx