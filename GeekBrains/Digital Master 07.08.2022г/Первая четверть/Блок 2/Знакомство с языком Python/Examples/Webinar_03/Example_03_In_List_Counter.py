'''
3. Напишите программу, которая определит позицию второго вхождения строки в 
   списке либо сообщит, что её нет.

*Пример:*

- список: ["qwe", "asd", "zxc", "qwe", "ertqwe"], ищем: "qwe", ответ: 3
- список: ["йцу", "фыв", "ячс", "цук", "йцукен", "йцу"], ищем: "йцу", ответ: 5
- список: ["йцу", "фыв", "ячс", "цук", "йцукен"], ищем: "йцу", ответ: -1
- список: ["123", "234", 123, "567"], ищем: "123", ответ: -1
- список: [], ищем: "123", ответ: -1
'''

our_list = ["qwe", "asd", "zxc", "qwe", "ertqwe"]
u = "qwe"
count = 0
print(our_list)

for i in range(len(our_list)):
    if our_list[i] == u:
        count += 1
        if count == 2:
            break
print(f'Второе вхождение строки в список на {i} позиции.')