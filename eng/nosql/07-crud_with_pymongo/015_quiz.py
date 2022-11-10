import pymongo
import sys

"""
Please enter the missing line of Python code that would be needed
in place of XXX to find one document in the collection and
print it out properly.

The code is written in Python 2. You'll need to convert
it to Python 3 first.
"""

# establish a connection to the server, and use it to get a handle on the scores collection.
connection = pymongo.MongoClient("mongodb://localhost")

# get a handle to the school database and the scores collection.
db = connection.school
scores = db.scores

try:
        XXX

except Exception as e:
        print "Unexpected error:", type(e), e

print doc
