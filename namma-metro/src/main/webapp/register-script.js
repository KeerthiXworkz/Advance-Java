function validateForm() {
  var username = document.getElementById('username').value;
  var email = document.getElementById('email').value;
  var phone = document.getElementById('phone').value;
  var address = document.getElementById('address').value;
  var address = document.getElementById('password').value;

  if (username === ''  email === ''  phone === '' || address === '' || password==='') {
    alert('All fields are required!');
    return false;
  }

  // Add more specific validation if needed

  alert('Registration successful!');
  document.getElementById('register').reset();
}