#!/usr/bin/env python3

import pymongo

# establish a connection to the database
connection = pymongo.MongoClient("mongodb://localhost")

# get a handle to the school database
db = connection.reddit
stories = db.stories


def find():
    print("find() with regex")
    print()

    query = {'title': {'$regex': 'python|javascript', '$options': 'i'}}
    projection = {'title': 1, '_id': 0}

    try:
        cursor = stories.find(query, projection)

    except Exception as e:
        print("Unexpected error:", type(e), e)

    for doc in cursor:
        print(doc)

#############################################################################

if __name__ == '__main__':
    find()
