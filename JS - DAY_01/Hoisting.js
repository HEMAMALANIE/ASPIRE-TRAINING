/*Hoisting-is an phenomenon in javascript where we can access the variables and functions even before initialing it without getting an error */

var x=7;
function getName(){
    console.log("Aspire Systems");
}

console.log(x);
getName();