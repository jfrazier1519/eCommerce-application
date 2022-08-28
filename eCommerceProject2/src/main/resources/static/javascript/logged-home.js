


window.onload = function () {
    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("logoutButton").addEventListener('click', logout)
    document.getElementById("productsButton").addEventListener('click', products);
    
    
}

function home(){
    window.location.href = "http://18.212.29.73:9002/html/logged-home.html";
}

function profile(){
    window.location.href = "http://18.212.29.73:9002/html/profile.html";
}

function orders(){
    window.location.href = "http://18.212.29.73:9002/html/orders.html";
}


function cart(){
    window.location.href = "http://18.212.29.73:9002/html/cart.html";
}

function products(){
    window.location.href = "http://18.212.29.73:9002/html/logged-products.html";
}

function logout(){
    let xhttp = new XMLHttpRequest();
    xhttp.open('GET', `http://18.212.29.73:9002/logout`);
   xhttp.send();

   window.location.href = "http://18.212.29.73:9002/html/home.html";
}




