function submitForm() {
  var fromStation = document.getElementById('fromStation').value;
  var toStation = document.getElementById('toStation').value;
  var noOfTickets = document.getElementById('noOfTickets').value;
  var paymentOption = document.getElementById('paymentOption').value;

  // Basic validation
  if (fromStation === ''  toStation === ''  noOfTickets <= 0) {
    alert('Please fill in all required fields with valid information.');
    return;
  }

  // Process the form data (You can send it to a server for further processing)

  // Display a success message (you may redirect to a confirmation page)
  alert('Ticket booked successfully!\nFrom: ' + fromStation + '\nTo: ' + toStation + '\nNumber of Tickets: ' + noOfTickets + '\nPayment Option: ' + paymentOption);

  // Reset the form
  document.getElementById('metroBookingForm').reset();
}