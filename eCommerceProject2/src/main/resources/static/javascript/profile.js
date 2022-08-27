

window.onload = function () {
    // getProfile();
    // document.getElementById("updateButton").addEventListener('click', updateForm)


    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("logoutButton").addEventListener('click', logout)
}




function updateForm(theEvent) {
     //we want the page to access the getProfile() function again to reload itself with updated fields
     newUser();
 }


// async function getProfile() {

//    //Ajax logic to get profile items upon load window load

    

// }



// async function updateProfile() {

//    //Ajax logic to get input from user and send to server via JSON (All info sends in one JSON upon button click)

    

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