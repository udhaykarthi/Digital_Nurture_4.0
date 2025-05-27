const events = [
    { name: "Data Analysis", date: "2025-04-12", seats: 100 },
    { name: "Coding Bootcamp", date: "2025-04-13", seats: 200 }
];

events.forEach(event => {
    if (new Date(event.date) > new Date() && event.seats > 0) {
        console.log(event.name);
    }
});

function register(event) {
    try {
        if (event.seats <= 0) throw "No seats available";
        event.seats--;
        console.log("Registered!");
    } catch (e) {
        console.error(e);
    }
}
