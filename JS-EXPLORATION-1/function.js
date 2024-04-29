// Function Declaration
function calculateRectangleArea(length, width) {
    return length * width;
}

// Arrow Function Expression
const calculateRectangleAreaArrow = (length, width) => length * width;

// Using the functions
const length = 5;
const width = 3;

const area1 = calculateRectangleArea(length, width);
const area2 = calculateRectangleAreaArrow(length, width);

console.log("Area calculated using Function Declaration:", area1);
console.log("Area calculated using Arrow Function Expression:", area2);
