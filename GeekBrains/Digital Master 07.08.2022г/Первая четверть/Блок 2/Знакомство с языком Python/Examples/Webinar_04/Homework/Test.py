#from random import randint

#n = 6
#lst = []
# for i in range(n):
# #n = 6
# if randint(0, 2) > 0:
#		lst.append(f'{randint(0, 100)}x**{n-i}')
# #for i in range(n - 1, 1 , -1):
# #    if randint(0, 10) > 5:
# #        lst.append(f'{randint(0, 100)}x**{i}')

# #print(' + '.join(lst))
# print(*lst)

from random import randint, choice

k = 8
k_list = []
for i in range(k + 1):
    r = randint(0, 100)
    if randint(0, 2) > 0:
        if k - i > 1:
            k_list.append(f'{r}x**{k - i}' if r > 1 else f'x**{k - i}')
        elif k - i == 1:
            k_list.append(f'{r}x' if r > 1 else f'x')
        else:
            if r != 0: k_list.append(f'{r}')
        k_list.append(choice('+-'))
k_list[len(k_list) - 1] = ' = 0'
print(*k_list)