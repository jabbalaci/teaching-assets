#!/usr/bin/env python3

import pymongo

# establish a connection to the database
connection = pymongo.MongoClient("mongodb://localhost")


def insert_two():

    # get a handle to the school database
    db = connection.school
    people = db.people

    print("insert_one()")
    print()

    alice = {"name": "Alice", "company": "MongoDB",
        "interests": ['horses', 'skydiving', 'fencing']}    # no _id
    bob = {"_id": "bob", "name": "Bob", "company": "MongoDB",
        "interests": ['running', 'cycling', 'photography']}    # has _id

    try:
        people.insert_one(alice)
        people.insert_one(bob)

    except Exception as e:
        print("Unexpected error:", type(e), e)

    print(alice)
    print(bob)

#############################################################################

if __name__ == '__main__':
    insert_two()
