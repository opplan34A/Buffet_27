#Ruben Coleman Garcia 11/12/2026
#Python LAB 010_NESTED_LOOP
symbol = input("Please provide a symbol ")
height = int(input("Please provide a height "))
width = int(input("Please provide a width "))
for x in range (0,height): 
    print ("")
    for y in range (0,width):
        print (symbol,end="")
    