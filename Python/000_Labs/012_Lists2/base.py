#Ruben Coleman Garcia 11/13/2026
#Python LABS 012_LISTS2
print ("This code will give you a random number 1-10")
userint = int(input("Please provide the amount of random numbers that you would like: "))
import random
userint = userint - 1
for x in range (0,userint):
    
    print (random.randrange(1,11),end=",")
print(random.randrange(1,11))





