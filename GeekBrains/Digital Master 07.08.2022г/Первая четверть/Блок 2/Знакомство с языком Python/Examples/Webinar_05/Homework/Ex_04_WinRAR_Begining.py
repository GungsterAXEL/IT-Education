'''
    4 Реализуйте RLE алгоритм: реализуйте модуль сжатия и восстановления данных.
    Входные и выходные данные хранятся в отдельных текстовых файлах.

    aaaasssdddwwwwwwwwwwwweeeffffff -> 4a3s3d9w3w3e6f
    4a3s3d9w3w3e6f-> aaaasssdddwwwwwwwwwwwweeeffffff
'''
from Zero import my_winrar_compression, my_winrar_decompression
input_file = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_05\Homework\Ex_04_Input.txt'
output_file = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_05\Homework\Ex_04_Output.txt'
decompression_file = '.\GeekBrains\Digital Master 07.08.2022г\Первая четверть\Блок 2\Знакомство с языком Python\Examples\Webinar_05\Homework\Ex_04_Decompression.txt'

with open(input_file, 'r') as file:
    content = my_winrar_compression(file.read())
with open(output_file, 'w') as file:
    file.write(content)
print(content)

with open(output_file, 'r') as file:
    text = my_winrar_decompression(file.read())
with open(decompression_file, 'w') as file:
    file.write(text)
print(text)