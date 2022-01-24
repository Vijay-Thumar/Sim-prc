localStorage.setItem("name","Vijay");
// localStorage.removeItem("name");
console.log(localStorage.getItem('name'));

sessionStorage.setItem('name','dhruv');
// sessionStorage.removeItem('name');
// console.log(sessionStorage.getItem('name'))
sessionStorage.setItem("work","docter");
// console.log(sessionStorage.getItem('work'))

document.cookie = 'name=VijayThumar; expires=' + new Date (2022,1,25)
.toUTCString()

document.cookie = 'name2=El-Vijay; expires=' + new Date (2022,1,25)
.toUTCString()
console.log(document.cookie)