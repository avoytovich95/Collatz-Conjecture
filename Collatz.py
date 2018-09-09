# Collatz Conjecture in Python
# Tested in python scripter

import sys

def main():
    num = input("Enter a positive integer: ")
    while num is not 1:
        sys.stdout.write("%d " % num)
        if num % 2 is 0:
            num = num / 2
        else:
            num = num * 3 + 1
    print(num)


main()

# Demo:
#   Enter a positive integer: 300
#   300 150 75 226 113 340 170 85 256 128 64 32 16 8 4 2 1
#
#   Enter a positive integer: 120
#   120 60 30 15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
