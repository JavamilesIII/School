a=int(input())
b=int(input())
if a != b:
    while True:
        if a<b:
            a,b = b,a
        c=a-b
        a=b
        b=c
else:
    print("ggT: ",a)