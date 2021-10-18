#!/usr/bin/env python3

from flask import Flask, render_template
app = Flask(__name__)


@app.route('/')
def hello_world():
    context = {
        'name': 'Laci',
        'count': 10
    }
    return render_template('03-index.html', **context)
    # equivalent to:
    # return render_template('03-index.html', name='Laci', count=10)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
