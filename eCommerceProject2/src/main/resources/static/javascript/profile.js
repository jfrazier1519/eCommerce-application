

window.onload = function () {
    getProfile();
    document.getElementById("updateButton").addEventListener('click', updateUser)


    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("logoutButton").addEventListener('click', logout)
}







function getProfile() {

    //    //Ajax logic to get profile items upon load window load
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let newUser = JSON.parse(xhttp.responseText);
            console.log(newUser);
            profileDOM(newUser);
        }


    }
    xhttp.open('POST', 'http://18.212.29.73:9002/customer/viewprofilepage');
    xhttp.send();
}

function profileDOM(newUser){

    document.getElementById("firstName").innerText= newUser.firstName;
    document.getElementById("lastName").innerText= newUser.lastName;
    document.getElementById("address").innerText= newUser.address;
    document.getElementById("city").innerText= newUser.city;
    document.getElementById("postalCode").innerText= newUser.postalCode;
    document.getElementById("country").innerText= newUser.country;
    document.getElementById("phoneNumber").innerText= newUser.telNo;
    document.getElementById("email").innerText= newUser.email;
}

async function updateUser() {

    //Ajax logic to get input from user and send to server via JSON (All info sends in one JSON upon button click)
     const textField = document.value
 
     
 
        
         const inputFirstName = document.getElementById("firstName").value;
         const inputLastName = document.getElementById("lastName").value;
         const inputAddress = document.getElementById("address").value;
         const inputCity = document.getElementById("city").value;
         const inputPostalCode = document.getElementById("postalCode").value;
         const inputCountry = document.getElementById("country").value;
         const inputPhoneNumber = document.getElementById("phoneNumber").value;
         const inputEmail = document.getElementById("email").value;
         
        
        
        
        
         console.log("Our input firstName is: ", inputFirstName);
         console.log("Our input lastName is: ", inputLastName);
         console.log("Our input address is: ", inputAddress);
         console.log("Our input city is: ", inputCity);
         console.log("Our input postalCode is: ", inputPostalCode);
         console.log("Our input country is: ", inputCountry);
         console.log("Our input phoneNumber is: ", inputPhoneNumber);
         console.log("Our input email is: ", inputEmail);
 
         let myNewCustomerObject = {
           
             "firstName": inputFirstName,
             "lastName": inputLastName,
             "address": inputAddress,
              "city":inputCity,
             "postalCode":inputPostalCode,
              "country":inputCountry,
             "telNo":inputPhoneNumber,
             "email":inputEmail
 
         }
     
         const responsePayload = await fetch('http://18.212.29.73:9002/customer/updateprofilepage',
         {
             method: 'post',
             'headers': {
                 'content-type': 'application/json'
             },
             'body': JSON.stringify(myNewCustomerObject)  
         });
        // window.location.href = "http://18.212.29.73:9002/html/profile.html";
}
        

function home() {
    window.location.href = "http://18.212.29.73:9002/html/logged-home.html";
}

function profile() {
    window.location.href = "http://18.212.29.73:9002/html/profile.html";
}

function orders() {
    window.location.href = "http://18.212.29.73:9002/html/orders.html";
}


function cart() {
    window.location.href = "http://18.212.29.73:9002/html/cart.html";
}

function logout() {
    let xhttp = new XMLHttpRequest();
    xhttp.open('GET', `http://18.212.29.73:9002/logout`);
    xhttp.send();

    window.location.href = "http://18.212.29.73:9002/html/home.html";
}