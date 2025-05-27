const container = document.querySelector("#events");

function displayEvent(event) {
    const card = document.createElement("div");
    card.innerText = `${event.name} - ${event.date}`;
    container.appendChild(card);
}
