import random
import time
import os
def game():
    name = input("What is your name? ")
    count = 1
    x = random.randint(1, 1000)
    print("Guess the number!")
    y = int(input("Your guess: "))
    start=time.time()
    while y != x:
        if y < x:
            print("Higher!")
        else:
            print("Lower!")
        count += 1
        y = int(input("Your guess: "))
    if y == x:
            print(f"Exacly, the number was {x}!")
            print(f"Elapsed time: {round(time.time() - start, 0)}s")
            print(count, "guesses!")
            if os.path.exists("highscores.txt"):
                f = open("highscores.txt", "a")
            else:
                f = open("highscores.txt", "x")
                f.write("Name / Tries / Time needed\n")
            f.write(f"{name}   {count}     {round(time.time() - start, 0)}s\n")
while True:
    game()
    if input("Wanna replay? (y/n) ") == 'n':
        break
