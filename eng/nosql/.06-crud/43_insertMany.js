// imdb ID is the _id this time

use video;

db.movies.drop();

db.movies.insertMany(
    [
        {"_id": "tt0100802", "title": "Total Recall", "year": 1990, "score": 7.5},
        {"_id": "tt0080684", "title" : "Star Wars V", "year" : 1980, "score" : 8.8},
        {"_id": "tt0107290", "title" : "Jurassic Park", "year" : 1993, "score" : 8.1},
        {"_id": "tt0099365", "title" : "Darkman", "year" : 1990, "score" : 6.4}
    ]
);
