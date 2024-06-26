#!/usr/bin/env python3

from flask import Flask, render_template, request

app = Flask(__name__)


@app.route('/')
def hello_world():
    context = {
        'name': 'Laszlo',
    }
    return render_template('05-index.html', **context)


@app.route('/icecream')
def fn_icecream():
    flavor = request.args.get('flavor', '').strip()
    context = {
        'flavor': flavor,
    }
    return render_template('05-icecream.html', **context)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
