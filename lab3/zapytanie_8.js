db.people.find({"location.city": "Moskwa"})
db.people.updateMany({"location.city": "Moscow"},{$set:{"location.city": "Moskwa"}})