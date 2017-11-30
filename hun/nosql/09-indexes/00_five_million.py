#!/usr/bin/env python3

"""
Start it with the Unix time command:

    $ time ./00_five_million.py

It'll be slow. On my desktop machine it took 14 minutes
to finish...
"""

import pymongo

connection = pymongo.MongoClient("mongodb://localhost")

db = connection.test
coll_students = db.students


def main():
    coll_students.drop()
    for i in range(1, 5000000+1):    # 5 million
        coll_students.insert_one({'student_id': i})

##############################################################################

if __name__ == "__main__":
    main()
