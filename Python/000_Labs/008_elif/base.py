#Ruben Coleman Garcia 11/4/2026
#Python Labs 008 ELIF 
print ("Hey welcome to calculator.")
numinputone = int(input("Please provide an integer: ")) 
operator = input("Please provide an operater ex: +-* etc : ")
numinputwo = int(input("Please provide another integer: "))

if operator == "+" :
    print ("Your product is")
    print (numinputone + numinputwo)
elif operator == "-" :
    print ("Your product is")
    print (numinputone - numinputwo)
elif operator == "*":
    print ("Your product is")
    print (numinputone * numinputwo)
elif operator == "/":
    print ("Your product is")
    print (numinputone / numinputwo)