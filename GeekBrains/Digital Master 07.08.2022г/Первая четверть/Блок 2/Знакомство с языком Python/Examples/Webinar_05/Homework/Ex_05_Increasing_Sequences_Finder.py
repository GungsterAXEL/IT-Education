'''
    5* Дан список чисел. Найдите все возрастающие последовательности.
    Порядок элементов менять нельзя.

    *Пример:*
    [1, 5, 2, 3, 4, 6, 1, 7] => [1, 2, 3] или [1, 7] или [1, 6, 7] и т.д.
'''
'''
    TODO:
    Если в 13й строке писать number_list[0] вместо number_list[i],
    то в каждой последовательности будет присутствовать 1.
    НО! При наличии 9 вместо первого элемента все последовательности найдены не будут.
    Не понятно пока как обойти этот момент.
'''

number_list = [1, 5, 2, 3, 4, 6, 1, 7]
sequences_list = []

for i in range(len(number_list)):
    arr_n = []
    arr_n.append(number_list[i])
    for j in range(len(number_list)):
        if number_list[j] < arr_n[-1]:
            arr_n.append(number_list[j])
    if len(arr_n) > 1 and arr_n not in sequences_list:
        sequences_list.append(arr_n)

print(sequences_list)