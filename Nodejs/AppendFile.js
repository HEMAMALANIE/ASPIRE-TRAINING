var fs = require('fs');

fs.appendFile('Sample.txt', 'Hello content!', function (err) {
  if (err) throw err;
  console.log('Saved!');
});