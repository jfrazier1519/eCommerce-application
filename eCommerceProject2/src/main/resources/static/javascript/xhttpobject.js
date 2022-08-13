




window.onload = function () {
    document.getElementById("loginButton").addEventListener('click', loginForm)
}



function loginForm(theEvent) {
    theEvent.preventDefault();
    login();
}

function login() {

    const inputUsername = document.getElementById("loginUsername").value;
    const inputPassword = document.getElementById("loginPassword").value;

    console.log("Our input username is: ", inputUsername);
    console.log("Our input password is: ", inputPassword);


    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        console.log("in ready state function");

        console.log(xhttp.readyState);

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            console.log("readyState is 4! AND ...status is 200 OK");

            console.log("checkpoint 2");
            console.log("checkpoint 1", xhttp.responseText);

            // let accountObj = JSON.parse(xhttp.responseText);
            // console.log(accountObj);
        }

    }

    xhttp.open('POST', `http://localhost:9002/eCommerceProject/login`);

    
    let myLoginObject = {
        "username": inputUsername,
        "password": inputPassword
    };

    xhttp.setRequestHeader("content-type", "application/json");

    xhttp.send(JSON.stringify(myLoginObject));
    // xhttp.send();

}


