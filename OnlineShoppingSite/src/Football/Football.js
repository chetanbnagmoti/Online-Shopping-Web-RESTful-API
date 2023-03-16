function Football (){
    const shoot = () => {
        alert("Great Goal !!!");
    }

    const unShoot = () =>{
        alert("Not Goal !!!");
    }
    return (


        <button onClick={shoot}>shoot</button> //JSX
        
    );
    
}

export default Football;