#!/usr/bin/env python3

from flask import Flask, render_template
app = Flask(__name__)

import pymongo

conn = pymongo.MongoClient()    # connect to localhost

db = conn['video']    # select database
coll = db['movies']   # select collection


@app.route('/')
def index():
    return render_template('02-index.html')


@app.route('/list')
def movie_list():
    return render_template('02-list.html')


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
