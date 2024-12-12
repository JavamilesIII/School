import os
f = open("fabeln.txt", "r")
lines = f.readlines()
f.close()
if os.path.exists("fabel1.txt"):
    f1 = open("fabel1.txt", "a")
else:
    f1 = open("fabel1.txt", "x")
if os.path.exists("fabel2.txt"):
    f2 = open("fabel2.txt", "a")
else:
    f2 = open("fabel2.txt", "x")
for i, x in enumerate(lines):
    if i %2 == 0:
        f1.write(x)
    else:
        f2.write(x)
f1.close()
f2.close()