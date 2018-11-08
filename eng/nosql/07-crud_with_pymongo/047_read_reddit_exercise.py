#!/usr/bin/env python3

"""
At the moment, this program is a copy of the previous one.

If you look at a story in the JSON closely, you'll notice that
each story has a unique ID. Which field is this?
This ID is used on Reddit, to identify a story.

When inserting in the DB, use this ID as the "_id" field.
That is, instead of using an ObjectId field, use the Reddit
ID as the "_id" field.
"""

import json

import pymongo
import requests

# connect to mongo
connection = pymongo.MongoClient("mongodb://localhost")

# get a handle to the reddit database
db = connection.reddit
stories = db.stories

# drop existing collection
stories.drop()


def main():
    # get the reddit page
    r = requests.get("http://www.reddit.com/r/programming/.json")
    # parse the json into python objects
    html = r.text
    parsed = json.loads(html)

    # there's a simpler way:
    # parsed = requests.get(...).json()

    # iterate through every news item on the page
    for item in parsed['data']['children']:
        # put it in mongo
        #
        # XXX
        #
        stories.insert_one(item['data'])

##############################################################################

if __name__ == "__main__":
    main()
