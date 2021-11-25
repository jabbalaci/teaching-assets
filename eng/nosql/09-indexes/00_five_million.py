#!/usr/bin/env python3

"""
Start it with the Unix time command:

    $ time ./00_five_million.py

It'll be slow.

Exercise:

1) What does the program do?

2) Speed it up. The execution time should be less than 2 minutes.
"""

import pymongo

connection = pymongo.MongoClient("mongodb://localhost")

db = connection.test
coll_students = db.students

coll_students.drop()


def main():
    for i in range(1, 5_000_000 + 1):    # 5 million
        if i % 100_000 == 0:
            print("#", i)
        coll_students.insert_one({'student_id': i})

##############################################################################

if __name__ == "__main__":
    main()
