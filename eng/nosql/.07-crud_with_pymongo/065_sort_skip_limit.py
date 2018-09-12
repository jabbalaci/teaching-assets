#!/usr/bin/env python3

import pymongo

# establish a connection to the database
connection = pymongo.MongoClient("mongodb://localhost")

# get a handle to the school database
db = connection.school
scores = db.scores


def find():
    print("find() with sort, skip, limit")
    print()

    try:
        cursor = scores.find()    # find all documents
        
        cursor.sort('student_id', pymongo.ASCENDING)
        # cursor.sort([('student_id', pymongo.ASCENDING),
        #              ('score', pymongo.DESCENDING)])
        cursor.skip(4)
        cursor.limit(1)

    except Exception as e:
        print("Unexpected error:", type(e), e)

    for doc in cursor:
        print(doc)

#############################################################################

if __name__ == '__main__':
    find()
