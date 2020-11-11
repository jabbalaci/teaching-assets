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

headers = {
    'User-agent': 'Mozilla/5.0 (X11; Linux x86_64; rv:70.0) Gecko/20100101 Firefox/70.0'
}


def main():
    # get the reddit page, fake that we are a Firefox browser
    r = requests.get("http://www.reddit.com/r/programming/.json", headers=headers)
    # parse the json into python objects
    html = r.text
    parsed = json.loads(html)

    # there's a simpler way:
    # parsed = requests.get(...).json()

    # iterate through every news item on the page
    for item in parsed['data']['children']:
        # put it in mongo
        stories.insert_one(item['data'])
        print(".", end="", flush=True)
    #
    print()

    print("done")

##############################################################################

if __name__ == "__main__":
    main()
