

window.onload = function () {
    // getOrders();
    listOnLoad();
    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("logoutButton").addEventListener('click', logout)
}



// async function getOrders() {

//    //Ajax logic to get orders upon load window load

    

// }

function home(){
    window.location.href = "http://localhost:9002/html/logged-home.html";
    // window.location.href = "http://18.212.29.73:9002/html/logged-home.html";
}

function profile(){
    window.location.href = "http://localhost:9002/html/profile.html";
    // window.location.href = "http://18.212.29.73:9002/html/profile.html";
}

function orders(){
    window.location.href = "http://localhost:9002/html/orders.html";
    // window.location.href = "http://18.212.29.73:9002/html/orders.html";
}


function cart(){
    window.location.href = "http://localhost:9002/html/cart.html";
    // window.location.href = "http://18.212.29.73:9002/html/cart.html";
}

function logout(){
    let xhttp = new XMLHttpRequest();
    xhttp.open('GET', `http://localhost:9002/logout`);
    // xhttp.open('GET', `http://18.212.29.73:9002/logout`);
   xhttp.send();

   window.location.href = "http://localhost:9002/html/home.html";
//    window.location.href = "http://18.212.29.73:9002/html/home.html";
}

async function listOnLoad(){
    // const responsePayload = await fetch(`http://18.212.29.73:9002/previousorders`);
    const responsePayload = await fetch(`http://localhost:9002/previousorders`);
    const ourJSON = await responsePayload.json();
    console.log(ourJSON);
    ourDOMManipulationFunction(ourJSON);
}

function ourDOMManipulationFunction(ourObject){
    for(let i=0; i<ourObject.length; i++){
        let newTR = document.createElement("tr");
        let newTH = document.createElement("th");

        let newTD1 = document.createElement("td");
        let newTD2 = document.createElement("td");
        let newTD3 = document.createElement("td");

        //step 2: populate our creations
        newTH.setAttribute("scope", "row");
        let myTextH = document.createTextNode(ourObject[i].order_id);
        let myTextD1 = document.createTextNode(ourObject[i].order_date);
        let myTextD2 = document.createTextNode(ourObject[i].quantity);
        let myTextD3 = document.createTextNode(ourObject[i].total);

        //all appending
        newTH.appendChild(myTextH);
        newTD1.appendChild(myTextD1);
        newTD2.appendChild(myTextD2);
        newTD3.appendChild(myTextD3);

        newTR.appendChild(newTH);
        newTR.appendChild(newTD1);
        newTR.appendChild(newTD2);
        newTR.appendChild(newTD3);

        let newSelection = document.querySelector("#previousOrdersBody");
        newSelection.appendChild(newTR);
    }
}
