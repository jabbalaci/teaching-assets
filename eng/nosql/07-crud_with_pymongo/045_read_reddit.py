#!/usr/bin/env python3

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
        stories.insert_one(item['data'])

##############################################################################

if __name__ == "__main__":
    main()
