#!/usr/bin/env python3

from flask import Flask, render_template, request, jsonify

from models.person import Person

app = Flask(__name__)

DB = {
    'tr': {
        'title': 'Total Recall',
        'year': 1990,
    },
    'r1': {
        'title': 'Rogue One',
        'year': 2016,
    }
}


@app.route('/')
def hello_world():
    context = {
        'name': 'Laszlo',
    }
    return render_template('06-index.html', **context)


@app.route('/movies/<string:code>')
def fn_movies(code):
    m = DB.get(code)
    if m:
        return jsonify(m)
    else:
        msg = {
            "error": "not found"
        }
        return jsonify(msg)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
