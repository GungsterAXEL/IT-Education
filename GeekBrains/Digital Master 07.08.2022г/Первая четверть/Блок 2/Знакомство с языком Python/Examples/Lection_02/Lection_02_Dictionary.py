'''
Словари - неупорядоченные коллекции произвольных объектов с доступом по ключу.
'''
dictionary = {}
# Чтобы была возможность описать ключи и значения в столбик пишем \.
dictionary = \
    {
        'up': '↑',  # Слева ключ, справа значение.
        'left': '←',
        'down': '↓',
        'right': '→'
    }
print(dictionary)  # {'up':'↑', 'left':'←', 'down':'↓', 'right':'→'}
print(dictionary['left'])  # ←
# типы ключей могут отличаться

'''
Просмотр всех ключей в словаре.
'''

for k in dictionary.keys():
    print(k)

'''
Просмотр всех значений в словаре.
'''
for k in dictionary.values():
    print(k)

'''
Просмотр значения ключа в словаре.
'''
print(dictionary['up'])  # ↑
# типы ключей могут отличаться
dictionary['left'] = '⇐'
print(dictionary['left'])  # ⇐
# print(dictionary['type']) # KeyError: 'type'
del dictionary['left']  # удаление элемента
for item in dictionary:  # for (k,v) in dictionary.items():
    print('{}: {}'.format(item, dictionary[item]))
# up: ↑
# down: ↓
# right: →