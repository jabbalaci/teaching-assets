#!/usr/bin/env python3

from flask import Flask

app = Flask(__name__)


@app.route("/")
def index():
    return "Hello, World!"


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
