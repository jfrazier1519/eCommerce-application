



window.onload = function () {
    // getProducts();


    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("accountButton").addEventListener('click', account)
}



async function getProducts() {

    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = JSON.parse(xhttp.responseText);
            productsDOM(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/products/viewall')
    xhttp.send();
}

function productsDOM(productsList){
    documents.getElementById()
}

function account() {
    window.location.href = "http://localhost:9002/html/login.html";
}

function home() {
    window.location.href = "http://localhost:9002/html/logged-home.html";
}

function cart() {
    window.location.href = "http://localhost:9002/html/cart.html";
}