import {useEffect, useState} from "react";
import axios from "axios";

const App = () => {
  const [users, setUsers] = useState([])

  useEffect(() => {
      axios.get('/api/users').then(({data})=>setUsers(data))
  }, []);

    return (
        <div>
            <h1>APPP</h1>
            {users.map(user=><div key={user.id}>{user.name} -- {user.age}</div>)}
        </div>
    );
};

export {App};