#!/usr/bin/env python3

from flask import Flask, render_template, request

app = Flask(__name__)


@app.route("/")
def index():
    context = {
        "name": "Laszlo",
    }
    return render_template("06-index.html", **context)


@app.route("/icecream")
def fn_icecream():
    flavor = request.args.get("flavor", "").strip()
    context = {
        "flavor": flavor,
    }
    return render_template("06-icecream.html", **context)


if __name__ == "__main__":
    app.run(debug=True)  # listen on localhost ONLY
