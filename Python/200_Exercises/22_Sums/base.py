# Ruben Coleman Garcia 11/9/2026
# Excersize 22 SUMS
Userint = int(input("Please provide an integer: "))

Userinputending = Userint + 1
Sum = 0

counter = 1 
addingint = 1
for counter in range (0,Userinputending) :
    print (counter, end="+")
    Sum = Sum + counter
   
print ("")
print ("Sum of 1 to " + str(Userint) + " is:" + str(Sum))


