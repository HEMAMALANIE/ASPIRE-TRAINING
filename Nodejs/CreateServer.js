var http = require('http');


http.createServer(function (req, res) {
  res.write('Welcome to Aspire Systems');
  res.end(); 
}).listen(8086); 