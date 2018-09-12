#!/usr/bin/env python3

import pymongo

# establish a connection to the database
connection = pymongo.MongoClient("mongodb://localhost")

# get a handle to the school database
db=connection.school
scores = db.scores


def find():
    print("find() with projection")
    print()

    query = {'type': 'exam'}
    projection = {'student_id': 1, '_id': 0}
#    projection = {'student_id': 1}    # try it too

    try:
        cursor = scores.find(query, projection)
        
    except Exception as e:
        print("Unexpected error:", type(e), e)

    cnt = 0
    for doc in cursor:
        print(doc)
        cnt += 1
        if (cnt > 10):
            break

#############################################################################

if __name__ == '__main__':
    find()
