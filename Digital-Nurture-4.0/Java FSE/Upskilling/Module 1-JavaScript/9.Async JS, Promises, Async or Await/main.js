fetch("events.json")
  .then((res) => res.json())
  .then((data) => console.log(data))
  .catch((err) => console.error(err));

async function loadEvents() {
  console.log("Loading...");
  const res = await fetch("events.json");
  const data = await res.json();
  console.log(data);
}
loadEvents();
