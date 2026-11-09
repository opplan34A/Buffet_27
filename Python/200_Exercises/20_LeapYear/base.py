#Ruben Coleman Garcia 11/3/2026
#Exercise "20" Leap Year
userinput = int(input("please provide a year in the form of an integer and i will tell you if it is a leap year or not "))
yeardivide = userinput%4
hundredyeardivide = userinput%400
if year % 4 != 0:
    print ( "is not a leap year")


#Notes on Mr Pooles Presentation
# i will note if a step was done right by puttin the word check for correct or ! means correct
#starting command should be the input command check
# cast the input into an integer because they are storred as strings
# you want to use the modulo aka % which gets the remainder
# use in if statement 
# mr pooles example if year % 4 != 0:
# print (str(year) + " Year is not a leap year")
# it is also not a leap year when it is a hundred years that are not divisiable by 400 
# elif 100 % == 0 and year % 400 != 0: 
# print (str(year)+" is not a leap year")
# else:
# print (str(year)+ " is a leap year")
#