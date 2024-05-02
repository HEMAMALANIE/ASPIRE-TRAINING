var fs = require('fs');

fs.writeFile('Aspire.txt', 'Welcome to Aspire Systems as an employee', function (err) {
  if (err) throw err;
  console.log('Saved!');
});