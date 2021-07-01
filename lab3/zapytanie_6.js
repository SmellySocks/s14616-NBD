db.people.insertOne(
  {
    "birth_date": "1996-03-10T19:35:00",
    "credit": [
      {
        "type": "mastercard",
        "number": "2137420000691337",
        "currency": "PLN",
        "balance": "551.89"
      }
    ],
    "description": "lorem ipsum dolor sit amet",
    "email": "s14616@pjwstk.edu.pl",
    "first_name": "Michal",
    "height": "185.50",
    "job": "Academic Teacher",
    "last_name": "Hyla",
    "location": {
      "city": "Gdansk",
      "address": {
        "streetname": "Brzegi",
        "streetnumber": "55"
      }
    },
    "nationality": "Poland",
    "sex": "Male",
    "weight": "101.39"
  }
)

db.people.findOne({first_name:"Michal"})