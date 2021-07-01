var map = function() {
    for (var idx = 0; idx < this.credit.length; idx++) {
       var key = this.credit[idx].currency
       var value = parseInt(this.credit[idx].balance)
       emit(key, value)
    }
}
var reduce = function (key,value) {return Array.avg(value)}

db.people.mapReduce(map, reduce, {out:"asdf", query:{nationality:"Poland", sex:"Female"}})
printjson(db.asdf.find().toArray())
