db.people.updateMany({first_name:"Antonio"},{$set:{"hobby": "pingpong"}})
db.people.find({first_name:"Antonio"})