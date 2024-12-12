x = int(input("Your first number?"))
z = input("Your calucation?")
y = int(input("Your second number?"))


if z == "+":
    print(x + y)
elif z == "-":
    print(x - y)
elif z== "*":
    print(x * y)
elif z== "/":
    print(x / y)
else:
    print("error")
input("Press Enter to continue...")