import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
#joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()

# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself


# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke

Number = int (input ("How many jokes would you like to hear? "))
for x in range (0,Number) :
    joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
    print (joke["joke"])
print ("")
Numbertwo = int(input("How many two part jokes would you like to hear? "))
for y in range (0,Numbertwo):
    joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
    print (joke2Part["setup"])
    print (joke2Part["delivery"])
print ("")
print ("")
final = input("Would you like to hear a joke of my own? yes/no ")    
if final == "yes": 
    print ("Here is a joke of my own")
    print ("Why did the Ruben Spontaneously turn into a bicycle...")
    print (".....................")
    print ("......................")
    print ("....................")
    print ("......................")
    print ("He was two tired")
else :
    print ("Okay be seeing you!")