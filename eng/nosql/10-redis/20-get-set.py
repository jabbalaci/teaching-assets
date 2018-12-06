#!/usr/bin/env python3

import sys
import redis

r = redis.Redis()    # use default values


def main():
    r.delete("name")    # tabula rasa
    r.delete("value")    # tabula rasa

    name = r.get("name")
    print(name)
    print()

    r.set("name", "Laci")
    name = r.get("name")
    print(name)
    print(type(name))
    print()

    name = r.get("name").decode('utf-8')
    print(name)
    print(type(name))
    print()

    r.set("value", 42)
    value = int(r.get("value"))
    print(value + 2)
    print()

####################

if __name__ == "__main__":
    main()
