




window.onload = function () {

    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("loginButton").addEventListener('click', login)
    document.getElementById("registerButton").addEventListener('click', register)
}



function login(){
    window.location.href = "http://localhost:9002/html/login.html";
}

function home(){
    window.location.href = "http://localhost:9002/html/home.html";
}

function register(){
    window.location.href = "http://localhost:9002/html/new-account.html";
}

