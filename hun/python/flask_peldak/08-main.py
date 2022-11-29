#!/usr/bin/env python3

"""
add CSS
"""

from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
def index():
    return render_template("08-index.html", name="World")


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
