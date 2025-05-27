document.getElementById("registrationForm").onsubmit = function (e) {
  e.preventDefault();

  const name = e.target.elements.name.value.trim();
  const email = e.target.elements.email.value.trim();
  const event = e.target.elements.event.value;

  if (!name || !email) {
    document.getElementById("error").innerText = "All fields are required!";
    return;
  }

  const userData = { name, email, event };

  document.getElementById("error").innerText = "Submitting...";

  setTimeout(() => {
    fetch("https://mockapi.io/users", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(userData),
    })
      .then((res) => res.json())
      .then((data) => {
        document.getElementById("error").innerText = "Successfully registered!";
        console.log("Server response:", data);
      })
      .catch((err) => {
        document.getElementById("error").innerText = "Submission failed.";
        console.error("Error:", err);
      });
  }, 2000);
};
