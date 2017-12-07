#!/usr/bin/env python3

import json
from time import sleep

import redis

from flask import Flask, render_template

app = Flask(__name__)
r = redis.Redis()


def get_data_from_db():
    """
    Exercise: cache the result in Redis.

    The data should stay in the cache for 20 seconds.
    """
    # start: DB connection
    sleep(3)    # simulate that retrieving the data from the database is SLOW
    d = {
        'name': 'John Doe',
        'age': 22
    }
    # end: DB connection
    return d


@app.route('/')
def index():
    data = get_data_from_db()
    context = {
        'd': data
    }
    return render_template('02-index.html', **context)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
