var map_weight = function() {
       var key = this.sex
       var value = parseInt(this.weight)
       emit(key, value)
}
var map_height = function() {
       var key = this.sex
       var value = parseInt(this.height)
       emit(key, value)
}
var reduce = function (key,value) {return Array.avg(value)}

db.people.mapReduce(map_weight, reduce, {out:"weight"})
db.people.mapReduce(map_height, reduce, {out:"height"})
printjson(db.weight.find().toArray())
printjson(db.height.find().toArray())
