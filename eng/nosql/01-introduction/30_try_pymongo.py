#!/usr/bin/env python3

from pprint import pprint

import pymongo

# conn = pymongo.MongoClient('localhost', 27017)
conn = pymongo.MongoClient()    # connection

db = conn['video']    # select database
coll = db['movies']   # select collection


def main():
    doc = coll.find_one()
    pprint(doc)
    print()
    print("Title of the movie:", doc['title'])

##############################################################################

if __name__ == "__main__":
    main()
