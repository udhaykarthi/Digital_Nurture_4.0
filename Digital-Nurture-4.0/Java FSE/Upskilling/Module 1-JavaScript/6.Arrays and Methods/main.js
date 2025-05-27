let events = [];
events.push({ name: "Robotics Workshop", category: "Electronics" });

let codeEvents = events.filter(e => e.category === "Coding");

let cards = events.map(e => `Workshop on ${e.name}`);
console.log(cards);