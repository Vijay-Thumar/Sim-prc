$(document).ready(function(){

"use strict";

// alert("Hola amigos");
// console.log("hi amigos from console");

// var resultdiv = document.getElementById("gm");
// resultdiv.innerHTML = "Buenos dias!! for espional's";

// // Game char profile
// var name = "Vaas Montenegro";
// var age = 28;
// var isInsane= false;
// var quotes = "Did I ever tell you the definition of insanity?";
// var family = ["vaas", "stitra"];

// console.log("Name: " + name);
// typeof(name);

// console.log("Age: " + age);
// typeof(age);
// console.log("age when far cry 6 was launched with vaas dlc: " + (age+9));

// console.log("vass is insane? :" + isInsane);
// typeof(isInsane);
// console.log("quotes: " + quotes);
// typeof(quotes);
// console.log("Family: " + family[1]);
// typeof(family);

// if(isInsane){
//     console.log("Send the matrix 'jason brodys'");
// }else{
//     console.log("We reach the peace, nothing to worry about.");
// }

// var students = ["Dhruv","dhruvee","vijay","neha","trusha","rutvi","rahul","jaydeep","pooja","dhara","birva","samir","kaxa-sanjay","niral","PJ","Abhishek","kunj","avesh","abdul","aadil","irshad","deep-rider"];
// // for (let student of students){
// //     console.log("school friends: "+student);
// // }

// while(students.length >  0){
//     // let student = students.pop();
//     let student = students.shift();
//     console.log("hi: " + student);
// }

function addFavoriteBook(bookname){
    // console.log("all books: "+bookname);
    if(!bookname.includes("Great")){
        favoriteBooks.push(bookname);
    }
}

let favoriteBooks =[];

addFavoriteBook("A song of Ice and Fire");
addFavoriteBook("The Great Gatsby");
addFavoriteBook("Crime & Punishment");
addFavoriteBook("Great Expectations");
addFavoriteBook("You Don't Know JS");

console.log(favoriteBooks);

for(let name of favoriteBooks){
    console.log(name);
}

function printFavoriteBooks(){
    console.log(
        `Favorite Books: ${favoriteBooks.length}`
    )
}

printFavoriteBooks();
});