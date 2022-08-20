




window.onload = function () {
    logout();
    document.getElementById("loginButton").addEventListener('click', loginForm)
    document.getElementById("AccountButton").addEventListener('click', registerForm) //This is going to be a dropdown menu button with (profile page button, orders button, and logout button)
    document.getElementById("CartButton").addEventListener('click', productsForm)
    
}


//Form naturally wants to forward to another page. preventDefault keeps it from doing so.
function loginForm(theEvent) {
    //forward to login page
    loginForward();
}
function registerForm(theEvent) {

    // This will have three nested buttons:
    // - Profile Page
    // - Orders
    // - Logout

    theEvent.preventDefault();
    AccountStuff();
}
function productsForm(theEvent) {
    //forward to cart page
    cartForward();
}





async function loginForward() {

    const responsePayload = await fetch('http://localhost:9002/callLoginPage');

}

async function cartForward() {

    const responsePayload = await fetch('http://localhost:9002/callHomePage');

}

async function logout() {

    const responsePayload = await fetch('http://localhost:9002/logout');

}