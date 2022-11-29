#!/usr/bin/env python3

"""
...
"""

from flask import Flask, render_template, request

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("05p-index.html")


@app.route("/greet", methods=["POST"])
def greet():
    name = request.form.get("name")
    return render_template("05-greet.html", name=name)


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
