#!/usr/bin/env python3
# coding: utf-8

import signal
import time


def sigint_handler(signum, frame):
    print("Ne nyomkodd a CTRL+C-t!")


def main():
    while True:
        print('.')
        time.sleep(1)

##############################################################################

if __name__ == "__main__":
    signal.signal(signal.SIGINT, sigint_handler)
    main()
