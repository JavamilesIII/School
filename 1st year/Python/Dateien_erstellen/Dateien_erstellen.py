import os
x = input("Geben Sie einen Dateinamen ein: ")
if os.path.exists(x+".txt"):
    f = open(x+".txt", "a")
else:
    f = open(x+".txt", "x")
    f.write("HERZLICH WILLKOMMEN!\nEine Schule, zwei Abteilungen, drei Angebote.\nWirtschaftsgymnasium \nWirtschaftsmittelschule\nInformatikmittelschule\n\n")
y = ""
print("Mit q! beenden")
while y != "q!":
    f.write(y+"\n")
    y = input("Geben Sie einen Text ein: ")
f.close
