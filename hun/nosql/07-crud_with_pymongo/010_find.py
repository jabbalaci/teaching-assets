#!/usr/bin/env python3

import pymongo

# establish a connection to the database
connection = pymongo.MongoClient("mongodb://localhost")

# get a handle to the school database
db = connection.school
scores = db.scores


def find():
    print("using find()")
    print()
    query = {'type': 'exam'}

    try:
        cursor = scores.find(query)    # returns a cursor

    except Exception as e:
        print("Unexpected error:", type(e), e)

    cnt = 0
    for doc in cursor:
        print(doc)
        cnt += 1
        if (cnt > 10):
            break


def find_one():
    print("using find_one()")
    print()
    query = {'student_id': 10}

    try:
        doc = scores.find_one(query)    # returns a single document
        
    except Exception as e:
        print("Unexpected error:", type(e), e)

    print(doc)


def main():
    # find_one()
    find()

##############################################################################

if __name__ == '__main__':
    main()
