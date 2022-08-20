



window.onload = function () {
    document.getElementById("loginButton").addEventListener('click', loginForm)
    document.getElementById("AccountButton").addEventListener('click', accountForm) //This is going to be a dropdown menu button with (profile page button, orders button, and logout button)
    document.getElementById("CartButton").addEventListener('click', cartForm)
    
}


//Form naturally wants to forward to another page. preventDefault keeps it from doing so.
function productsForm(theEvent) {
    //forward to login page
    productForward();
}
function accountForm(theEvent) {

    // This will have three nested buttons:
    // - Profile Page
    // - Orders
    // - Logout

    theEvent.preventDefault();
    AccountStuff();
}
function cartForm(theEvent) {
    //forward to cart page
    cartForward();
}




async function productForward() {

    // const responsePayload = await fetch('http://localhost:9002/callLoginPage'); 

}

async function cartForward() {

    const responsePayload = await fetch('http://localhost:9002/callHomePage');

}