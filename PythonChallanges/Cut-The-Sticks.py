import math
import os
import random
import re
import sys

def cutTheSticks(arr):
    if len(arr) == 0:
        return
    
    res.append(len(arr))
    print("rest of array: ")
    print([x for x in arr if x - min(arr) > 0])
    print("length:")
    print(len(arr))

    cutTheSticks([x for x in arr if x - min(arr) > 0])
    

if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))
    res = []
    cutTheSticks(arr)
    #HackerRank solution
    #print('\n'.join(map(str, res)))
