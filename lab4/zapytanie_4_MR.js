var map = function() {emit(this.nationality, parseInt(this.weight)/((parseInt(this.height)/100)*(parseInt(this.height)/100)))}
var reduce = function (key,value) {return Array.avg(value)}
var reduce_min = function(key, values) {
    var min = values[0];
    values.forEach(function(val) {
        if (val < min) min = val;
    })
    return min;
}
var reduce_max = function(key, values) {
    var max = values[0];
    values.forEach(function(val) {
        if (val > max) max = val;
    })
    return max;
}

db.people.mapReduce(map, reduce, {out:"avg"})
db.people.mapReduce(map, reduce_min, {out:"min"})
db.people.mapReduce(map, reduce_max, {out:"max"})
printjson(db.avg.find().toArray())
printjson(db.min.find().toArray())
printjson(db.max.find().toArray())
