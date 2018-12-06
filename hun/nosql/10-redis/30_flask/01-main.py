#!/usr/bin/env python3

import redis

from flask import Flask, render_template

app = Flask(__name__)
r = redis.Redis()


@app.route('/')
def index():
    r.incr("homepage:index", 1)
    visits = r.get("homepage:index")
    context = {
        'visits': visits
    }
    return render_template('01-index.html', **context)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
