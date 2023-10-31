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
