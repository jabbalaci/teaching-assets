#!/usr/bin/env python3

from flask import Flask, render_template

from models.person import Person

app = Flask(__name__)


@app.route("/")
def index():
    me = Person("Jabba Laci", 37)
    context = {
        "p": me,
    }
    return render_template("04-index.html", **context)


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
