let a1=8;
var b=78;
var c = 78 - 8;

console.log(c);  //console area ->exec env
document.write(c);  // bring o/pp onn the html page 
alert(c);



let user = {


Name :"sdlc",
address : "marthalli",
phonenumber : "7349010452"
};

console.log(user);
document.write(user.Name+""+user.address+""+user.phonenumber);
   



function myFunc(theObject) {
    theObject.make = "Toyota";
  }
  
  const mycar = {
    make: "Honda",
    model: "Accord",
    year: 1998,
  };
  /*
  console.log(mycar.make); // "Honda"
  myFunc(mycar);
  console.log(mycar.make); // "Toyota"
  */

  console.log(mycar);
  myFunc(mycar);
 document.write(mycar.make+""+mycar.model+""+mycar.year);

 const num1 = 20;
const num2 = 3;
const name = "Chamakh";

// This function is defined in the global scope
function multiply() {
  return num1 * num2;
}

console.log(multiply()); // 60

// A nested function example
function getScore() {
  const num1 = 2;
  const num2 = 3;

  function add() {
    return `${name} scored ${num1 + num2}`;
  }

  return add();
}

console.log(getScore()); // "Chamakh scored 5"


const a = ["Hydrogen", "Helium", "Lithium", "Beryllium"];

const a2 = a.map(function (s) {
  return s.length;
});

console.log(a2); // [8, 6, 7, 9]

const a3 = a.map((s) => s.length);

console.log(a3); // [8, 6, 7, 9]
