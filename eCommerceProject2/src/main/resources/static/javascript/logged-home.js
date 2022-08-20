



window.onload = function () {
    document.getElementById("loginButton").addEventListener('click', loginForm)
    document.getElementById("profileButton").addEventListener('click', profileForm)
    document.getElementById("ordersButton").addEventListener('click', ordersForm)
    document.getElementById("logoutButton").addEventListener('click', logoutForm)
    document.getElementById("cartButton").addEventListener('click', cartForm)
    
}


//Form naturally wants to forward to another page. preventDefault keeps it from doing so.
function productsForm(theEvent) {
    //forward to login page
    productForward();
}
function profileForm(theEvent) {

    theEvent.preventDefault();
    profileForward();
}
function ordersForm(theEvent) {
    
    theEvent.preventDefault();
    ordersForward();
}
function logoutForm(theEvent) {
    
    theEvent.preventDefault();
    logoutForward();
}

function cartForm(theEvent) {
    //forward to cart page
    cartForward();
}




async function productForward() {

    // const responsePayload = await fetch('http://localhost:9002/callLoginPage'); 

}

async function profileForward() {

    // const responsePayload = await fetch('http://localhost:9002/callLoginPage'); 

}
async function ordersForward() {

    // const responsePayload = await fetch('http://localhost:9002/callLoginPage'); 

}
async function logoutForward() {

    const responsePayload = await fetch('http://localhost:9002/callHomePage'); 

}

async function cartForward() {

    const responsePayload = await fetch('http://localhost:9002/callHomePage');

}