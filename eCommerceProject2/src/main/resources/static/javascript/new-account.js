



window.onload = function () {
    // document.getElementById("newUserButton").addEventListener('click', newUserForm)

    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("loginButton").addEventListener('click', login)
    document.getElementById("registerButton").addEventListener('click', register)
}


// function newUserForm(theEvent) {
//     theEvent.preventDefault();
//     newUser();
// }

function login(){
    window.location.href = "http://localhost:9002/html/login.html";
}

function home(){
    window.location.href = "http://localhost:9002/html/home.html";
}

function register(){
    window.location.href = "http://localhost:9002/html/new-account.html";
}

// async function newUser() {

//    //Ajax logic to get input from user and send to server via JSON (All info sends in one JSON upon button click)

    

// }

