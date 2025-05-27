document.getElementById("registerBtn").onclick = function () {
    console.log("User registered!");
};

document.getElementById("categoryFilter").onchange = function (e) {
    console.log("Filter: " + e.target.value);
};

document.addEventListener("keydown", function (e) {
    console.log("Searching: " + e.key);
});
