import secrets
import string

letters = string.ascii_letters
digits = string.digits
special_caracters = string.punctuation
alphabet = letters + digits + special_caracters
pwd_length = 100

pwd = ''
for i in range(pwd_length):
  pwd += ''.join(secrets.choice(alphabet))



while True:
    pwd = ''
    for i in range(pwd_length):
        pwd += '' .join(secrets.choice(alphabet))
    if(any(char in special_caracters for char in pwd) and sum (char in digits for char in pwd)>=2):
        break
print(pwd)
input()