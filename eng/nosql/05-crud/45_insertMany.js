// imdb ID is the _id this time

use video;

db.movies.drop();

db.movies.insertMany(
    [
        {"_id": "tt0100802", "title": "Total Recall", "year": 1990, "score": 7.5},
        {"_id": "tt0080684", "title": "Star Wars V", "year": 1980, "score": 8.8},
        {"_id": "tt0107290", "title": "Jurassic Park", "year": 1993, "score": 8.1},
        {"_id": "tt0099365", "title": "Darkman", "year": 1990, "score": 6.4},
        {"_id": "tt2802144", "title": "Kingsman: The Secret Service", "year": 2014, "score": 7.7},
        {"_id": "tt0117731", "title": "Star Trek: First Contact", "year": 1996, "score": 7.6},
        {"_id": "tt0083658", "title": "Blade Runner", "year": 1982, "score": 8.2}
    ]
);
