#!/usr/bin/env python3

import pandas as pd
from pprint import pprint

class Distance:
    pass


def main():
    df = pd.read_csv("colors.csv", delimiter=";", skipinitialspace=True)
    d = df.to_dict('records')
    pprint(d)

##############################################################################

if __name__ == "__main__":
    main()
