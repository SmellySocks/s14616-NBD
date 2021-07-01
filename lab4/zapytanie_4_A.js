db.people.aggregate([
    {$group: {_id: "$nationality", avgBMI:{$avg:{$divide :[{$toDecimal: "$weight"},{$pow: [{$divide: [{$toDecimal: "$height"},100]},2]}]}}, minBMI:{$min:{$divide :[{$toDecimal: "$weight"},{$pow: [{$divide: [{$toDecimal: "$height"},100]},2]}]}}, maxBMI:{$max:{$divide :[{$toDecimal: "$weight"},{$pow: [{$divide: [{$toDecimal: "$height"},100]},2]}]}}}},
    {$match : {}}
])