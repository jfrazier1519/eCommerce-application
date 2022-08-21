



window.onload = function () {
    // getProducts();


    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("accountButton").addEventListener('click', account)
}



// async function getProducts() {

//    //Ajax logic to get product items upon load window load
//    //Then DOM manipulate items into a table in html page

    

// }

function account(){
    window.location.href = "http://localhost:9002/html/login.html";
}

function home(){
    window.location.href = "http://localhost:9002/html/logged-home.html";
}

function cart(){
    window.location.href = "http://localhost:9002/html/cart.html";
}