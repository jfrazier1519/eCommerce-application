

window.onload = function () {
    getProducts();

    document.getElementById("homeButton").addEventListener('click', home)
    document.getElementById("cartButton").addEventListener('click', cart)
    document.getElementById("profileButton").addEventListener('click', profile)
    document.getElementById("ordersButton").addEventListener('click', orders)
    document.getElementById("logoutButton").addEventListener('click', logout)

    document.getElementById("cartButton1").addEventListener('click', addToCart1)
    document.getElementById("cartButton2").addEventListener('click', addToCart2)
    document.getElementById("cartButton3").addEventListener('click', addToCart3)
    document.getElementById("cartButton4").addEventListener('click', addToCart4)
    document.getElementById("cartButton5").addEventListener('click', addToCart5)
    document.getElementById("cartButton6").addEventListener('click', addToCart6)
    document.getElementById("cartButton7").addEventListener('click', addToCart7)
    document.getElementById("cartButton8").addEventListener('click', addToCart8)
}

//Use the add to cart method here Chandler. Excuse the mess. Mistakes were made.
function addToCart1(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=1')
    xhttp.send();

}

function addToCart2(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=2')
    xhttp.send();

}

function addToCart3(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=3')
    xhttp.send();

}

function addToCart4(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=4')
    xhttp.send();

}

function addToCart5(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=5')
    xhttp.send();

}

function addToCart6(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=6')
    xhttp.send();

}

function addToCart7(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=7')
    xhttp.send();

}

function addToCart8(){
    
    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = xhttp.responseText;
            console.log(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/addtocart?id=8')
    xhttp.send();

}

async function getProducts() {

    let xhttp = new XMLHttpRequest();

    xhttp.onreadystatechange = function () {

        if (xhttp.readyState == 4 && xhttp.status == 200) {
            let productsList = JSON.parse(xhttp.responseText);
            console.log(productsList);
            productsDOM(productsList);
        }
    }
    xhttp.open('POST', 'http://localhost:9002/products/viewall')
    xhttp.send();
}


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

function productsDOM(productsList){

    
    document.getElementById("name1").innerText = productsList[0].product_name;
    document.getElementById("cat1").innerText = "Category: " + productsList[0].category.categoryName;
    document.getElementById("quant1").innerText = "Quantity: " + productsList[0].quantity;
    document.getElementById("price1").innerText = "Price: " + productsList[0].price;
    document.getElementById("desc1").innerText = "Description: " + productsList[0].product_desc;
    document.getElementById("rev1").innerText = "Review: " + productsList[0].product_review;
    document.getElementById("id1").innerText = productsList[0].productId;

    document.getElementById("name2").innerText = productsList[1].product_name;
    document.getElementById("cat2").innerText = "Category: " + productsList[1].category.categoryName;
    document.getElementById("quant2").innerText = "Quantity: " + productsList[1].quantity;
    document.getElementById("price2").innerText = "Price: " + productsList[1].price;
    document.getElementById("desc2").innerText = "Description: " + productsList[1].product_desc;
    document.getElementById("rev2").innerText = "Review: " + productsList[1].product_review;
    document.getElementById("id2").innerText = productsList[1].productId;

    document.getElementById("name3").innerText = productsList[2].product_name;
    document.getElementById("cat3").innerText = "Category: " + productsList[2].category.categoryName;
    document.getElementById("quant3").innerText = "Quantity: " + productsList[2].quantity;
    document.getElementById("price3").innerText = "Price: " + productsList[2].price;
    document.getElementById("desc3").innerText = "Description: " + productsList[2].product_desc;
    document.getElementById("rev3").innerText = "Review: " + productsList[2].product_review;
    document.getElementById("id3").innerText = productsList[2].productId;

    document.getElementById("name4").innerText = productsList[3].product_name;
    document.getElementById("cat4").innerText = "Category: " + productsList[3].category.categoryName;
    document.getElementById("quant4").innerText = "Quantity: " + productsList[3].quantity;
    document.getElementById("price4").innerText = "Price: " + productsList[3].price;
    document.getElementById("desc4").innerText = "Description: " + productsList[3].product_desc;
    document.getElementById("rev4").innerText = "Review: " + productsList[3].product_review;
    document.getElementById("id4").innerText = productsList[3].productId;

    document.getElementById("name5").innerText = productsList[4].product_name;
    document.getElementById("cat5").innerText = "Category: " + productsList[4].category.categoryName;
    document.getElementById("quant5").innerText = "Quantity: " + productsList[4].quantity;
    document.getElementById("price5").innerText = "Price: " + productsList[4].price;
    document.getElementById("desc5").innerText = "Description: " + productsList[4].product_desc;
    document.getElementById("rev5").innerText = "Review: " + productsList[4].product_review;
    document.getElementById("id5").innerText = productsList[4].productId;

    document.getElementById("name6").innerText = productsList[5].product_name;
    document.getElementById("cat6").innerText = "Category: " + productsList[5].category.categoryName;
    document.getElementById("quant6").innerText = "Quantity: " + productsList[5].quantity;
    document.getElementById("price6").innerText = "Price: " + productsList[5].price;
    document.getElementById("desc6").innerText = "Description: " + productsList[5].product_desc;
    document.getElementById("rev6").innerText = "Review: " + productsList[5].product_review;
    document.getElementById("id6").innerText = productsList[5].productId;

    document.getElementById("name7").innerText = productsList[6].product_name;
    document.getElementById("cat7").innerText = "Category: " + productsList[6].category.categoryName;
    document.getElementById("quant7").innerText = "Quantity: " + productsList[6].quantity;
    document.getElementById("price7").innerText = "Price: " + productsList[6].price;
    document.getElementById("desc7").innerText = "Description: " + productsList[6].product_desc;
    document.getElementById("rev7").innerText = "Review: " + productsList[6].product_review;
    document.getElementById("id7").innerText = productsList[6].productId;

    document.getElementById("name8").innerText = productsList[7].product_name;
    document.getElementById("cat8").innerText = "Category: " + productsList[7].category.categoryName;
    document.getElementById("quant8").innerText = "Quantity: " + productsList[7].quantity;
    document.getElementById("price8").innerText = "Price: " + productsList[7].price;
    document.getElementById("desc8").innerText = "Description: " + productsList[7].product_desc;
    document.getElementById("rev8").innerText = "Review: " + productsList[7].product_review;
    document.getElementById("id8").innerText = productsList[7].productId;

}
