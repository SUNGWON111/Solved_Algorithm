x = int(input())
y = int(input())
# 양양 1, 음양 2, 음음 3, 양음 4
# 양양
if x > 0 and y > 0:
    print('1')
# 음양
elif x < 0 and y > 0:
    print('2')
# 음음
elif x < 0 and y < 0:
    print('3')
# 양음
else:
    print('4')