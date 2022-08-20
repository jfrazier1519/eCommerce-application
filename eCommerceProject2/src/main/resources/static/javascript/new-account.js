



window.onload = function () {
    document.getElementById("newUserButton").addEventListener('click', newUserForm)
}


function newUserForm(theEvent) {
    theEvent.preventDefault();
    newUser();
}



async function newUser() {

   //Ajax logic to get input from user and send to server via JSON (All info sends in one JSON upon button click)

    

}