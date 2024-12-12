import os
path = "C:\Users\loicm\Downloads\Klassen_alle"
x = os.listdir(path)
os.rename(path + "\\" + x[0], path + "\\" + x[0]-"Klassendruck_")