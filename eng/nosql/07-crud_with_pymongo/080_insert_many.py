#!/usr/bin/env python3

import pymongo

# establish a connection to the database
connection = pymongo.MongoClient("mongodb://localhost")

db = connection.school
coll = db.people

coll.drop()


def insert_many():
    print("insert_many()")
    print()
    # coll.count() is deprecated in the newest driver :(
    print("before: {}".format(coll.estimated_document_count()))

    alice = {"_id": "alice", "name": "Alice", "company": "MongoDB",
        "interests": ['horses', 'skydiving', 'fencing']}
    bob = {"_id": "bob", "name": "Bob", "company": "MongoDB",
        "interests": ['running', 'cycling', 'photography']}
    cecile = {"_id": "cecile", "name": "Cecile", "company": "MongoDB",
    "interests": ['swimming', 'jogging']}

    people = [alice, bob]
    # people = [alice, bob, alice, cecile]

    try:
        coll.insert_many(people)
        # coll.insert_many(people, ordered=False)

    except Exception as e:
        print("Unexpected error:", type(e), e)

    print("after: {}".format(coll.estimated_document_count()))

#############################################################################

if __name__ == '__main__':
    insert_many()
