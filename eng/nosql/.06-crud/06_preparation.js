use movies;

db.movieDetails.updateOne({title: "The Martian"}, {$unset: {poster: 1}})

db.movieDetails.updateOne({title: "The Martian"}, {$unset: {awards: 1}})
