numPlayers = int(input())

starTeam = True
starPlayers = 0

for x in range (numPlayers):
	stars = (int(input()) * 5) - (int(input()) * 3)
	if stars <= 40:
		starTeam = False
	else:
		starPlayers += 1

if starTeam:
	print(str(starPlayers) + "+")
else:
	print(starPlayers)
