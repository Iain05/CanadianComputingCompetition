text = input()
happy = ":-)"
sad = ":-("
numHappy = 0
numSad = 0

numHappy = text.count(":-)")
numSad = text.count(":-(")

if numHappy == 0 and numSad == 0:
    print("none")
elif numHappy == numSad:
    print("unsure")
elif numHappy > numSad:
    print("happy")
else:
    print("sad")
