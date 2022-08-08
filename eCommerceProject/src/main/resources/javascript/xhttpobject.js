




window.onload = function () {
    document.getElementById("loginButton").addEventListener('click', loginForm)
}



function loginForm(TheEvent) {
    TheEvent.preventDefault();
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

            // let accountObj = JSON.parse(xhttp.responseText);
            // console.log(accountObj);
        }



    }



    xhttp.open('POST', `https://localhost:9002/eCommerceProject/login`, true);

    
    let myLoginObject = {
        "Username": inputUsername,
        "Password": inputPassword
    };

    xhttp.setRequestHeader("content-type", "application/json");

    xhttp.send(JSON.stringify(myLoginObject));
    // xhttp.send();

}


