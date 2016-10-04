#!/usr/bin/env python2
# encoding: utf-8

import time
import signal

def sigint_handler(signum, frame):
    print "Ne nyomkodd a CTRL+C-t!"


def main():
    while True:
        print '.'
        time.sleep(1)

##############################################################################

if __name__ == "__main__":
    signal.signal(signal.SIGINT, sigint_handler)
    main()
