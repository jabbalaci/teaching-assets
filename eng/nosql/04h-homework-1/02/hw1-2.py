#!/usr/bin/env python3

from pprint import pprint

import pymongo

# conn = pymongo.MongoClient('localhost', 27017)
conn = pymongo.MongoClient()    # connection

db = conn['mongolab']    # select database
coll = db['numbers']   # select collection


def main():
    cursor = coll.find()
    total = 0
    for doc in cursor:
        if doc['value'] % 5 == 0:
            total += doc['value']
        #
    #
    total = int(total)
    print("The answer is: {}".format(total))

##############################################################################

if __name__ == "__main__":
    main()
