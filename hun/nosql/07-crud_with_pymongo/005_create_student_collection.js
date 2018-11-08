use school;

db.scores.drop();

var types = ['exam', 'homework', 'quiz'];

for (student_id = 0; student_id < 100; ++student_id) {
    for (type = 0; type < 3; ++type) {
        var doc = {'student_id': student_id, 'type': types[type], 'score': Math.random() * 100};
        db.scores.insertOne(doc);
    }
}
