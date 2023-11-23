# 23.10.31 프로그래머스 Tartget Number 문제
    def targetNumber_BFS(numbers, target):
        resultList = [0]
        for i in range(len(numbers)):
            tempList = []
            for now in range(len(resultList)):
                tempList.append(resultList[now] + numbers[i])
                tempList.append(resultList[now] - numbers[i])
            resultList = tempList
        return resultList

inputList1 = [1, 1, 1, 1, 1]
tarGet1 = 3
result1 = 5
targetNumber_BFS(inputList1, tarGet1)

# [PCCP 기출문제] 1번 
# https://school.programmers.co.kr/learn/courses/30/lessons/250137

def monster(bandage, health, attacks):
    nowHealth  = health
    before = []

    for attack in attacks:
        atTime = attack[0]
        demage = attack[1]
        if len(before) != 0:
            recoverTime = atTime - before[0] - 1
            nowHealth += int(recoverTime/bandage[0]) * bandage[2] + recoverTime* bandage[1]
            if nowHealth > health:
                nowHealth = health
        before = attack
        nowHealth -= demage
        if nowHealth <= 0:
            return -1
    return nowHealth
