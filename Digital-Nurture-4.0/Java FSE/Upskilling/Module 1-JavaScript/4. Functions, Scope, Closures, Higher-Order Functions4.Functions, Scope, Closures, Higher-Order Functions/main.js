function addEvent(name, category, date) {
    return { name, category, date, seats: 10 };
}

function registerUser(event) {
    event.seats--;
}

function filterEventsByCategory(events, category) {
    return events.filter(e => e.category === category);
}

function registrationTracker() {
    let count = 0;
    return function () {
        count++;
        return count;
    };
}

const trackMusic = registrationTracker();
console.log(trackMusic());
