import random
import time
punktesp = 0
punkteco = 0
maxpunkte = int(input("To how many points do you want to play? "))
def rps():
    rps_list = ['Rock', 'Paper', 'Scissors']
    global x
    x=random.choice(rps_list)
    #print(x)
while (punkteco or punktesp) != maxpunkte:
    rps()
    print('Rock')
    time.sleep(0.5)
    print('Paper')
    time.sleep(0.5)
    print('Scissors')
    time.sleep(0.5)
    print('Shoot:')

    y = input("Your choice? ")
    if x == 'Rock' and y == 'Paper':
        punktesp += 1
        print(x)
        print("You win the round!")
    elif x == 'Paper' and y == 'Scissors':
        punktesp += 1
        print(x)
        print("You win the round!")
    elif x == 'Scissors' and y == 'Rock':
        punktesp += 1
        print(x)
        print("You win the round!")
    elif x == y:
        print(x)
        print("Replay!")
    else:
        punkteco += 1
        print(x)
        print("Computer wins the round!")

if punkteco == maxpunkte:
    print(punkteco, "-- Computer wins the game!!")
elif punktesp == maxpunkte:
    print(punktesp, "-- You win the game!!")
input("Press enter to continue")