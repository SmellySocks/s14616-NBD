db.people.aggregate([
    {$group: {_id: "$sex", avgWeight:{$avg: {$toDecimal : "$weight"}},avgHeight:{$avg: {$toDecimal : "$height"}}}},
    {$match : {}}
])