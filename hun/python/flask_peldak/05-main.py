#!/usr/bin/env python3

"""
...
"""

from flask import Flask, render_template, request

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("05-index.html")


@app.route("/greet")
def greet():
    name = request.args.get("name")
    return render_template("05-greet.html", name=name)


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
