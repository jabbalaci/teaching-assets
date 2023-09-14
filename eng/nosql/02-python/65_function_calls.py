#!/usr/bin/env python3

"""
Count how many times an element
is present in a list.
"""


def analyze_list(li):
    d = {}
    # TODO: build the dictionary
    return d


def main():
    fruits = ["kiwi", "apple", "banana", "orange", "apple", "banana", "orange", "banana"]
    d = analyze_list(fruits)
    print(d)
    # it should look similar to this:
    # {'kiwi': 1, 'apple': 2, 'banana': 3, 'orange': 2}


##############################################################################

if __name__ == "__main__":
    main()
