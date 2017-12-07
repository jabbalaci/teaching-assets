#!/usr/bin/env python3

import sys
import redis

r = redis.Redis("localhost", 6379)
#r = redis.Redis()    # use default values

def check_server():
    try:
        r.info()
    except redis.exceptions.ConnectionError:
        print("Error: cannot connect to redis server. Is the server running?", file=sys.stderr)
        sys.exit(1)


def main():
    check_server()
    print("The server is up and running.")

####################

if __name__ == "__main__":
    main()
