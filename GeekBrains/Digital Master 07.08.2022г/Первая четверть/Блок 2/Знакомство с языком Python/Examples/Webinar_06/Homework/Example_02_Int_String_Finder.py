'''
2. Задайте список. Напишите программу, которая определит, присутствует ли в 
   заданном списке строк некое число.
   ['22', '33', '123', 'fwefe', 'ytyy', '55']
   
   f(n)
'''

our_list = ['22', '33', '123', 'fwefe', 'ytyy', '55']
u = 55

print(our_list)

# Было:
# for i in range(len(our_list)):
#    if our_list[i].isdigit() and int(our_list[i]) == u:
#        print(f'В списке присутствует искомое значение.\nНа позиции {i}')

#for i in our_list:
#    if i.isdigit() and int(i) == u:
#        print(f'В списке присутствует искомое значение.\nНа позиции.')

# Стало:
s = list(map(int, (i for i, v in enumerate(our_list) if v.isdigit() and int(v) == u)))
print(f'В списке присутствует искомое значение.\nНа позиции {s}' if len(s) > 0 else f'Ничего нет =(')