const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');
const fs = require('fs');

const app = express();
const port = 4000;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());


app.use(express.static(path.join(__dirname, 'public')));


app.get('/', (req, res) => {
  res.sendFile(path.join(__dirname, 'login.html'));
});


app.post('/login', (req, res) => {
  const { username, email, password, mobile, city } = req.body;
  const user = { username, email, password, mobile, city };
  

  const userData = JSON.parse(fs.readFileSync('db.json'));

 
  const existingUser = userData.find(u => u.username === username);
  if (existingUser) {
    res.status(400).send('User already exists.');
    return;
  }

  
  userData.push(user);

 
  fs.writeFileSync('db.json', JSON.stringify(userData, null, 2));

  res.send('User saved successfully!');
});


app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});
