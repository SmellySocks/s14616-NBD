var map = function () {emit(this.job,1)}
var reduce = function (key,value) {return key}

db.people.mapReduce(map, reduce, {out:"asdf"})
printjson(db.asdf.find().toArray())
