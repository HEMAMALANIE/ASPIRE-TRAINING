// Get the button and paragraph elements
const button = document.getElementById("myButton");
const paragraph = document.getElementById("myParagraph");

// Add an event listener to the button
button.addEventListener("click", function() {
    // Change the text of the paragraph when the button is clicked
    paragraph.textContent = "Button clicked! Text changed.";
});
