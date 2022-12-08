'''
2. Добавьте возможность использования скобок, меняющих приоритет операций.

    1+2*3 => 7;
    (1+2)*3 => 9;

'''

a = "2-2*2+10/2+(8-2)-(9+7)"

def sep(s):
    res = ""
    for item in s:
        if item in "+-/*()":
            res += f" {item} "
        else:
            res += item
    return res

def staples(s):
    res = []
    flag = False
    j = 0
    for value in s:
        if value == "(":
            flag = True
            res.append("")
            continue
        elif value == ")":
            flag = False
            j += 1
            continue
        if flag:
            res[j] += value
    return res

def myeval(s):
    lst = s.split()
    res = []
    j = 0
    for key, item in enumerate(lst):
        if item.isdigit():
            if key == 0:
                res.append(int(item))
                j += 1
            else:
                if lst[key - 1] == "*":
                    res.remove(res[j - 1])
                    j -= 1
                    if key - 3 >= 0:
                        res.append(int(f"{lst[key - 3]}{lst[key - 2]}") * int(item))
                    else:
                        res.append(int(f"{lst[key - 3]}{lst[key - 2]}") * int(item))
                    j += 1
                elif lst[key - 1] == "/":
                    res.remove(res[j - 1])
                    j -= 1
                    if key - 3 >= 0:
                        res.append(int(f"{lst[key - 3]}{lst[key - 2]}") / int(item))
                    else:
                        res.append(int(f"{lst[key - 3]}{lst[key - 2]}") / int(item))
                    j += 1
                else:
                    res.append(int(f"{lst[key - 1]}{item}"))
                    j += 1
    print(res)
    return sum(res)

def main():
    st = staples(sep(a))
    st_l = []
    for item in st:
        st_l.append(myeval(item))
main()