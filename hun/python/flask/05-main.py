#!/usr/bin/env python3

from flask import Flask, render_template, request

from models.person import Person

app = Flask(__name__)


@app.route('/')
def hello_world():
    me = Person('Jabba Laci', 29)
    context = {
        'p': me,
    }
    return render_template('index.html', **context)


@app.route('/fagyi')
def fn_fagyi():
    iz = request.args.get('iz', '').strip()
    context = {
        'iz': iz,
    }
    return render_template('fagyi.html', **context)


if __name__ == "__main__":
    app.run(debug=True)    # listen on localhost ONLY
#    app.run(debug=True, host='0.0.0.0')    # listen on all public IPs
