# 프로그래머스 DFS 문제풀이 모음
# 모음 사전
# https://school.programmers.co.kr/learn/courses/30/lessons/84512
answer = 0

def DFS(string, word):
    global answer
    alpabets = ['A', 'E', 'I', 'O', 'U']
    answer += 1
    if string == word:
        return True

    if len(string) == 5:
        return False

    for a in alpabets:
        if DFS(string + a, word):
            return True
def moumDict(word):
    global answer
    alpabets = ['A', 'E', 'I', 'O', 'U']
    for a in alpabets:
        if DFS(a, word):
            return True
