// Define functions for basic arithmetic operations
export function add(a, b) {
    return a + b;
}

export function subtract(a, b) {
    return a - b;
}

export function multiply(a, b) {
    return a * b;
}

export function divide(a, b) {
    if (b === 0) {
        throw new Error("Division by zero is not allowed.");
    }
    return a / b;
}
// Import functions from mathOperations.js module
import { add, subtract, multiply, divide } from './mathOperations.js';

// Perform arithmetic operations
const num1 = 10;
const num2 = 5;

console.log("Addition:", add(num1, num2));
console.log("Subtraction:", subtract(num1, num2));
console.log("Multiplication:", multiply(num1, num2));
console.log("Division:", divide(num1, num2));
