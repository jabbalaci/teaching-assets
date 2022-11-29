#!/usr/bin/env python3

from flask import Flask, render_template

app = Flask(__name__)


@app.route("/")
def index():
    context = {"name": "Laszlo", "count": 10}
    return render_template("03-index.html", **context)
    # equivalent to:
    # return render_template('03-index.html', name='Laszlo', count=10)


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
