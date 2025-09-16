#!/usr/bin/env python

import json

def write_file():
    person = {
        'last': 'Doe',
        'first': 'John',
        'age': 39,
        'sex': 'M',
        'registered': True,
        'salary': 70000,
    }

    f = open('employee.json', 'w')
    json.dump(person, f)
    f.close()

#############################################################################

if __name__ == "__main__":
    write_file()
