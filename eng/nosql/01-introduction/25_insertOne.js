use video;

db.movies.drop();

db.movies.insertOne({"title": "Total Recall", "year": 1990, "score": 7.5});
db.movies.insertOne({"title" : "Star Wars V", "year" : 1980, "score" : 8.8});
db.movies.insertOne({"title" : "Jurassic Park", "year" : 1993, "score" : 8.1});
db.movies.insertOne({"title" : "Darkman", "year" : 1990, "score" : 6.4});
