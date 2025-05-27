function greet(name = "User") {
    console.log(`Hello, ${name}`);
}

const event = { name: "Code", date: "2025-04-12" };
const { name, date } = event;

let allEvents = [...events]; // clone
