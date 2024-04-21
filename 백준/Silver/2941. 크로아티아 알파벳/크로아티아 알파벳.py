s = input()
cro_a = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
for i in cro_a:
    if i in s:
        s = s.replace(i, '*')
print(len(s))