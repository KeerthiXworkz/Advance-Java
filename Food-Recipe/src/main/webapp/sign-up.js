//function validateFirstName() {
//  let nameEle = document.getElementById("firstName");
//  let name = nameEle.value.trim();
//  let nameErr = document.getElementById("firstName-error");
//  let isNameValid = false;
//  const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
//  if (name === " " || name.length < 4) {
//    nameErr.innerHTML = "Must be at least 4 characters";
//    nameEle.style.border = "2px solid red";
//    nameErr.style.display = "inline";
//    isNameValid = false;
//  } else if (name === " " || name.length > 15){
//    nameErr.innerHTML = "Max 15 characters";
//    nameEle.style.border = "2px solid red";
//    nameErr.style.display = "inline";
//    isNameValid = false;
//  }
//  else if (!nameRegex.test(name)) {
//    nameErr.innerHTML = "Must contain only alphabets";
//    nameEle.style.border = "2px solid red";
//    nameErr.style.display = "inline";
//    isNameValid = false;
//  } else {
//    nameErr.style.display = "none";
//    nameEle.style.border = "2px solid green";
//    isNameValid = true;
//  }
//  return isNameValid;
//}
//
//function validateLastName() {
//  let nameEle = document.getElementById("lastName");
//  let name = nameEle.value.trim();
//  let nameErr = document.getElementById("lastName-error");
//  let isNameValid = false;
//  const nameRegex = /^[a-zA-Z]+( [a-zA-Z]*)*$/;
//  if (name === " " || name.length < 1) {
//    nameErr.innerHTML = "Must be at least 1 character";
//    nameEle.style.border = "2px solid red";
//    nameErr.style.display = "inline";
//    isNameValid = false;
//  } else if (name === " " || name.length > 15){
//    nameErr.innerHTML = "Max 15 characters";
//    nameEle.style.border = "2px solid red";
//    nameErr.style.display = "inline";
//    isNameValid = false;
//  }
//  else if (!nameRegex.test(name)) {
//    nameErr.innerHTML = "Must contain only alphabets";
//    nameEle.style.border = "2px solid red";
//    nameErr.style.display = "inline";
//    isNameValid = false;
//  } else {
//    nameErr.style.display = "none";
//    nameEle.style.border = "2px solid green";
//    isNameValid = true;
//  }
//  return isNameValid;
//}
//
//
//
//function validateEmail() {
//  let emailEle = document.getElementById("email");
//  let email = emailEle.value.trim();
//  let emailErr = document.getElementById("email-error");
//  let isEmailValid = false;
//  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
//  if (email === " " || email.length < 1) {
//    emailErr.innerHTML = "Email cannot be empty";
//    emailEle.style.border = "2px solid red";
//    emailErr.style.display = "inline";
//    isEmailValid = false;
//  } else if (!emailRegex.test(email)) {
//    emailErr.innerHTML = "Must be abc@example.com format";
//    emailEle.style.border = "2px solid red";
//    emailErr.style.display = "inline";
//    isEmailValid = false;
//  } else {
//    emailErr.style.display = "none";
//    emailEle.style.border = "2px solid green";
//    isEmailValid = true;
//  }
//  return isEmailValid;
//}
//
//function validateContactNumber() {
//  let contactNumberEle = document.getElementById("contactNumber");
//  let contactNumber = contactEle.value.trim();
//  let contactNumberErr = document.getElementById("contact-error");
//  let isContactNumberValid = false;
//  const contactNumberRegex = /^\d{10}$/;
//  if (contactNumber === " ") {
//    contactNumberErr.innerHTML = "Contact Number cannot be empty";
//    contactNumberEle.style.border = "2px solid red";
//    contactNumberErr.style.display = "inline";
//    isContactNumberValid = false;
//  } else if (!contactNumberRegex.test(contact)) {
//    contactNumberErr.innerHTML = "Should contaion only 10 digits";
//    contactNumberEle.style.border = "2px solid red";
//    contactNumberErr.style.display = "inline";
//    isContactNumberValid = false;
//  } else {
//    contactNumberErr.style.display = "none";
//    contactNumberEle.style.border = "2px solid green";
//    isContactNumberValid = true;
//  }
//  return isContactNumberValid;
//}
//
//function validateAlternativeNumber() {
//  let contactEle = document.getElementById("alternativeNumber");
//  let contact = contactEle.value.trim();
//  let contactErr = document.getElementById("alt-contact-error");
//  let isAlternativeNumberValid = false;
//  const contactRegex = /^\d{10}$/;
//  if (contact === " ") {
//    contactErr.innerHTML = "Contact Number cannot be empty";
//    contactEle.style.border = "2px solid red";
//    contactErr.style.display = "inline";
//    isAlternativeNumberValid = false;
//  } else if (!contactRegex.test(contact)) {
//    contactErr.innerHTML = "Should contaion only 10 digits";
//    contactEle.style.border = "2px solid red";
//    contactErr.style.display = "inline";
//    isAlternativeNumberValid = false;
//  } else {
//    contactErr.style.display = "none";
//    contactEle.style.border = "2px solid green";
//    isAlternativeNumberValid = true;
//  }
//  return isAlternativeNumberValid;
//}
//
//function validatePassword() {
//  var password = document.getElementById('password');
//  var passwordError = document.getElementById('password-error');
//  if (password.value.length < 7) {
//    passwordError.innerHTML = "Please provide a valid password";
//    password.style.border = "2px solid red";
//    passwordError.style.display = 'inline';
//    return false;
//  } else {
//    password.style.border = "2px solid green";
//    passwordError.style.display = 'none';
//    return true;
//  }
//}
//
//function validateAddress() {
//  var address = document.getElementById('address');
//  var addressError = document.getElementById('address-error');
//  if (address.value.trim() === '' || address.value.trim().length<5) {
//    addressError.innerHTML = "Address cannot be empty";
//    addressError.style.display = 'inline';
//    address.style.border = "2px solid red";
//    return false;
//  } else if(address.value.trim().length<5){
//    addressError.innerHTML = "Address must contain atleast 5 characters";
//    addressError.style.display = 'inline';
//    address.style.border = "2px solid red";
//    return false;
//  }else if(address.value.trim().length>100){
//    addressError.innerHTML = "Max characters allowed for address : 100";
//    addressError.style.display = 'inline';
//    address.style.border = "2px solid red";
//    return false;
//  }else {
//    addressError.style.display = 'none';
//    address.style.border = "2px solid green";
//    return true;
//  }
//}
//
//function validateForm() {
//  if (validateFName() && validateLName() && validateEmail() && validateContactNo() && validateAlternativeContactNo() && validateAddress() && validatePassword() && validateConfirmPassword()) {
//    return true;
//  }
//  else {
//    return false;
//  }
//}

// function validateUpdateForm(){
//   if (validateName() && validateEmail() && validateContactNo() && validateAddress()) {
//     return true;
//   }
//   else {
//     return false;
//   }
// }

// function validateChangePassword(){
//   if(validatePassword() && validateConfirmPassword()){
//     return true;
//   }else{
//     return false;
//   }
// }