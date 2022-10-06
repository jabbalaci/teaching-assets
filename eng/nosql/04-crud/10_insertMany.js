use video;

db.movies.drop();

db.movies.insertMany(
    [
        {"title": "Total Recall", "year": 1990, "score": 7.5, "imdb": "tt0100802"},
        {"title" : "Star Wars V", "year" : 1980, "score" : 8.8, "imdb": "tt0080684"},
        {"title" : "Jurassic Park", "year" : 1993, "score" : 8.1, "imdb": "tt0107290"},
        {"title" : "Darkman", "year" : 1990, "score" : 6.4, "imdb": "tt0099365"}
    ]
);
