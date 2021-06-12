import time
import uuid
import random as rand
import requests
import json

# list of football club names
teamList = ["Zrinjski", "Siroki Brijeg", "Dinamo", "Hajduk", "Lokomotiva",
"Bayern", "Real Madrid", "Chelsea", "Barcelona", "Manchester United"]

# creating random pairs from the list
def createTeams(teamList):
    firstTeam = rand.choice(teamList)
    secondTeam = rand.choice(teamList)
    if firstTeam == secondTeam:                 # if the teams are the same
        secondTeam = rand.choice(teamList)      # pick another one
    teamPair = firstTeam + " - " + secondTeam
    return teamPair

# creating random result that has max 7 goals per team
def createResults():
    firstResult = str(rand.randint(0,7))
    secondResult = str(rand.randint(0,7))
    finalResult = firstResult + " : " + secondResult
    return finalResult

# creating matches
def createMatch():
    match = { 
        "matchId" : str(uuid.uuid4()),
        "matchName" : createTeams(teamList),
        "endResult" : createResults()
    }
    yield match

# connection url
url = "http://localhost:8080/matches"

# endless generator that sends every second one match to a given route
def matchGenerator():
    while True:
        for i in createMatch():
            x = requests.post(url, json=i)
            print (json.dumps(i))
            time.sleep(1)

matchGenerator()