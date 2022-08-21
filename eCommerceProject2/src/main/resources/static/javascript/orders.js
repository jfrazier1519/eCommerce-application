

window.onload = function () {
    // getOrders();

    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("accountButton").addEventListener('click', logout)
}



// async function getOrders() {

//    //Ajax logic to get orders upon load window load

    

// }

function home(){
    window.location.href = "http://localhost:9002/html/logged-home.html";
}

function profile(){
    window.location.href = "http://localhost:9002/html/profile.html";
}

function orders(){
    window.location.href = "http://localhost:9002/html/orders.html";
}


function cart(){
    window.location.href = "http://localhost:9002/html/cart.html";
}

function logout(){
    //this will access logout server endpoint to invalidate session
}