import time

while True:
    Hundename = input('Geben Sie den Namen ihres Hundes ein: ')
    Hundealter = int(input('Geben Sie das Alter ihres Hundes ein: '))

    Hunderalter=Hundealter*7
        

    print(f'Ihr Hund {Hundename} ist {Hunderalter} Jahre im Menschenalter alt.')

    x=input('Drücken Sie Enter, um fortzufahren...')
    if x=='Enter':
        continue
  