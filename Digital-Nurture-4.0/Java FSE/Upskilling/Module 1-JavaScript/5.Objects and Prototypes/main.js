function Event(name, date, seats) {
    this.name = name;
    this.date = date;
    this.seats = seats;
}

Event.prototype.checkAvailability = function () {
    return this.seats > 0;
};

const e1 = new Event("Seminar", "2025-04-12", 120);
console.log(Object.entries(e1));
