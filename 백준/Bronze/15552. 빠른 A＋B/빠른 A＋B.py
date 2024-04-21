import sys

l = []
t = int(input())
for i in range(t):
    a, b = map(int, sys.stdin.readline().split())
    l.append(a + b)
for i in l:
    print(i)