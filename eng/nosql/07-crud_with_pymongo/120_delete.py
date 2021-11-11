#!/usr/bin/env python3

import datetime
import sys

import pymongo

connection = pymongo.MongoClient("mongodb://localhost")
db = connection.school
scores = db.scores

# removes one student
def remove_student(student_id):
    try:
        result = scores.delete_one({'student_id': student_id})
        # result = scores.delete_many({'student_id': student_id})

        print("num removed: ", result.deleted_count)

    except Exception as e:
        print("Exception: ", type(e), e)


def find_student_data(student_id):
    print("Searching for student data for student with id =", student_id)
    try:
        docs = scores.find({'student_id': student_id})
        for doc in docs:
            print(doc)

    except Exception as e:
        print("Exception: ", type(e), e)


def main():
    # remove_student(1)
    find_student_data(1)

##############################################################################

if __name__ == "__main__":
    main()
