var fs = require('fs');

fs.unlink('Sample.txt', function (err) {
  if (err) throw err;
  console.log('File deleted!');
});