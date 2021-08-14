# -*- coding: utf-8 -*-
"""
Created on Tue Mar 16 12:38:04 2021

@author: Manu Bhardwaj
"""
a = int(input())
if a > 1:
    for i in range(2 , a):
        if a % i == 0:
            print(a, " is not prime")
            break
    else:
        print(a ," is prime")
else:
    print(a, "is not prime")
        