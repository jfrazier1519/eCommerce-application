

window.onload = function () {
    // getOrders();

    listOnLoad();
    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("logoutButton").addEventListener('click', logout)
    document.getElementById("Checkout").addEventListener('click', checkout)
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
    let xhttp = new XMLHttpRequest();
    xhttp.open('GET', `http://localhost:9002/logout`);
   xhttp.send();

   window.location.href = "http://localhost:9002/html/home.html";
}

async function checkout(){
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let isVerified = xhttp.responseText;
            console.log(isVerified);
            if(isVerified){
                window.location.href = "http://localhost:9002/html/logged-home.html";
            }
        }
    }
    xhttp.open('POST', 'http://localhost:9002/checkout')
    xhttp.send();


    
}

async function listOnLoad(){
    const responsePayload = await fetch(`http://localhost:9002/shoppingcart`);
    const ourJSON = await responsePayload.json();
    console.log(ourJSON);
    ourDOMManipulationFunction(ourJSON);
}

function ourDOMManipulationFunction(ourObject){
    const shoppingCartProductList = ourObject.myProducts
    for(let i=0; i<shoppingCartProductList.length; i++){
        let newTR = document.createElement("tr");
        let newTH = document.createElement("th");

        let newTD1 = document.createElement("td");
        let newTD2 = document.createElement("td");
        let newTD3 = document.createElement("td");
        let newTD4 = document.createElement("td");

        //step 2: populate our creations
        newTH.setAttribute("scope", "row");
        let myTextH = document.createTextNode(shoppingCartProductList[i].productId);
        let myTextD1 = document.createTextNode(shoppingCartProductList[i].product_name);
        let myTextD2 = document.createTextNode(shoppingCartProductList[i].price);
        let myTextD3 = document.createTextNode(shoppingCartProductList[i].product_desc);
        let myTextD4 = document.createTextNode(shoppingCartProductList[i].product_review);

        //all appending
        newTH.appendChild(myTextH);
        newTD1.appendChild(myTextD1);
        newTD2.appendChild(myTextD2);
        newTD3.appendChild(myTextD3);
        newTD4.appendChild(myTextD4);

        newTR.appendChild(newTH);
        newTR.appendChild(newTD1);
        newTR.appendChild(newTD2);
        newTR.appendChild(newTD3);
        newTR.appendChild(newTD4);

        let newSelection = document.querySelector("#shoppingcartBody");
        newSelection.appendChild(newTR);
    }

}