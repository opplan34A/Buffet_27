#Ruben Coleman Garcia 11/12/2026
#Python LAB 009_FOR_LOOP
uinput = input("Would you like a verticle line or a horizontal line? ")
if uinput == "verticle":
    vinput = int(input("How tall would you like the line to be? "))
    for x in range(0,vinput):
        print ("*")
elif uinput == "horizontal":
    hinput = int(input("How long would you like the line to be? "))
    for y in range(0,hinput):
        print("*",end="")
else:
    print ("That was not an option GOODBYE!!!")