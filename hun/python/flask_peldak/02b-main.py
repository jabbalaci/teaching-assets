#!/usr/bin/env python3

"""
http://127.0.0.1:5000/?name=Laci
"""

from flask import Flask, render_template, request

app = Flask(__name__)


@app.route("/")
def index():
    name = request.args.get("name")
    return render_template("02b-index.html", name=name)


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
