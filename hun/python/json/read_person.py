#!/usr/bin/env python3

import json
from pprint import pprint


def read_file():
    f = open('person.json', 'r')
    d = json.load(f)
    f.close()
    #
    print(type(d))
    pprint(d, indent=2)

#############################################################################

if __name__ == "__main__":
    read_file()
