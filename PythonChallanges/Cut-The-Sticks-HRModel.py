#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the cutTheSticks function below.
def cutTheSticks(arr):
    if len(arr) == 0:
        return
    
    res.append(len(arr))
    cutTheSticks([x for x in arr if x - min(arr) > 0])
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))
    res = []
    cutTheSticks(arr)
    fptr.write('\n'.join(map(str, res)))
    fptr.write('\n')

    fptr.close()