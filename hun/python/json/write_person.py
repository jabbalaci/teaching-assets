#!/usr/bin/env python3

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
    json.dump(person, f, indent=2)
    f.close()

#############################################################################

if __name__ == "__main__":
    write_file()
