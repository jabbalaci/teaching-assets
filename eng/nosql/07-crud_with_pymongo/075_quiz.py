#!/usr/bin/env python3

"""
Do you expect the second insert below to succeed?
"""

...    # some missing parts

db = connection.school
people = db.people

doc = {
    "name": "Bob",
    "company": "MongoDB",
    "interests": ['running', 'cycling', 'photography']
}

try:
    people.insert_one(doc)   # first insert
    del doc['_id']
    people.insert_one(doc)   # second insert

except Exception as e:
    print("Unexpected error:", type(e), e)

print("done")
