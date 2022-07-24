
// import use state from react
import { useState } from "react";
import PersonalList from "./PersonalList";

export default function PersonalSetter(){

    const [userName, setUserName] = useState();
    const [userSurname, setUserSurname] = useState();

    const setUserFullName = () => {
        setUserName("Fatih");
        setUserSurname("Öztel");
    }

    return (
        <div>
            <PersonalList userName={userName} userSurname={userSurname}/>
            <button onClick={setUserFullName}>Submit</button>
        </div>
    )

}