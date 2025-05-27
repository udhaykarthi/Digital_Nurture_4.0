document.getElementById("registrationForm").onsubmit = function (e) {
  e.preventDefault();

  const name = e.target.elements.name.value.trim();
  const email = e.target.elements.email.value.trim();
  const event = e.target.elements.event.value;

  if (!name || !email) {
    document.getElementById("error").innerText = "All fields are required!";
    return;
  }

  document.getElementById("error").innerText = "";
  console.log(`User: ${name}, Email: ${email}, Event: ${event}`);
};
