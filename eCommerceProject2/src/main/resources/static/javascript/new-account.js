

//console.log("this Donny!!");

window.onload = function () {
    document.getElementById("newUserButton").addEventListener('click', newUserForm)
}


function newUserForm(theEvent) {
    theEvent.preventDefault();
    newUser();
}



async function newUser() {

   //Ajax logic to get input from user and send to server via JSON (All info sends in one JSON upon button click)
    const textField = document.value

    

        const inputUsername = document.getElementById("username").value;
        const inputPassword = document.getElementById("password").value;
        const inputFirstName = document.getElementById("firstName").value;
        const inputLastName = document.getElementById("lastName").value;
        const inputAddress = document.getElementById("address").value;
        const inputCity = document.getElementById("city").value;
        const inputPostalCode = document.getElementById("postalCode").value;
        const inputCountry = document.getElementById("country").value;
        const inputPhoneNumber = document.getElementById("phoneNumber").value;
        const inputEmail = document.getElementById("email").value;
        
       
       
       
        console.log("Our input username is: ", inputUsername);
        console.log("Our input password is: ", inputPassword);
        console.log("Our input firstName is: ", inputFirstName);
        console.log("Our input lastName is: ", inputLastName);
        console.log("Our input address is: ", inputAddress);
        console.log("Our input city is: ", inputCity);
        console.log("Our input postalCode is: ", inputPostalCode);
        console.log("Our input country is: ", inputCountry);
        console.log("Our input phoneNumber is: ", inputPhoneNumber);
        console.log("Our input email is: ", inputEmail);

        let myNewCustomerObject = {
            "username": inputUsername,
            "password": inputPassword,
            "firstName": inputFirstName,
            "lastName": inputLastName,
            "address": inputAddress,
             "city":inputCity,
            "postalCode":inputPostalCode,
             "country":inputCountry,
            "phoneNumber":inputPhoneNumber,
            "email":inputEmail

        }
    
        const responsePayload = await fetch('http://localhost:9002/customer/createcustomer',
        {
            method: 'post',
            'headers': {
                'content-type': 'application/json'
            },
            'body': JSON.stringify(myNewCustomerObject)  
        });
   console.log(myNewCustomerObject);
    
                    
      
}