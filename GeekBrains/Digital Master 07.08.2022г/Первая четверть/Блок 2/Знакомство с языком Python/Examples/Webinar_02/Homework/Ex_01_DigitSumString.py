print('Сейчас поскладываем цифры...')
user_input = input('Введите число:')
digit_string = ''.join(i for i in user_input if i.isdigit())
if digit_string.isdigit():
    digit_string = int(digit_string)
    print(f'Сумма цифр {digit_string}')
    digit_sum = 0
    while digit_string > 0:
        digit_sum += digit_string % 10
        digit_string //= 10
    print(f'будет равна {digit_sum}')
else:
    print('Цифр нет. =(')