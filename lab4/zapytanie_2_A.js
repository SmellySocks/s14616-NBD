db.people.aggregate([
    {$unwind: "$credit"},
    { $group: {_id: "$credit.currency", balance: {$sum: {$toDecimal: "$credit.balance"}}}}
])