#!/usr/bin/env python3

from flask import Flask, render_template
import pymongo

conn = pymongo.MongoClient()    # connect to localhost

db = conn['mongolab']    # select database
coll = db['numbers']     # select collection

app = Flask(__name__)


@app.route('/')
def index():
    return "hello"


@app.route('/hw1/3')
def total():
    cursor = coll.find()
    total = 0
    for doc in cursor:
        total += doc['value']
    #
    context = {
        'result': int(total)
    }
    return render_template('result.html', **context)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
