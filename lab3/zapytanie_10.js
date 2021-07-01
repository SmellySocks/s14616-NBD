db.people.updateMany({job:"Editor"},{$unset: {email:""}})
db.people.find({job:"Editor"})