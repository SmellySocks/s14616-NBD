db.people.aggregate([
    {$match:{nationality:"Poland", sex: "Female"}},
    {$unwind: "$credit"},
    { $group: {_id: "$credit.currency", totalbalance: {$sum: {$toDecimal: "$credit.balance"}},avgbalance: {$avg: {$toDecimal: "$credit.balance"}} }}
])