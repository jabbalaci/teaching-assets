#!/usr/bin/env python3

import json


def read_string():
    s = """{
    "path": "/home/luke/Dropbox/Public",
    "user_id": 123456,
    "auto_sync": true
}"""

    d = json.loads(s)

    print(d)

#############################################################################

if __name__ == "__main__":
    read_string()
