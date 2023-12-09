# 진법 변환
# https://www.acmicpc.net/problem/2745

def numChange():
    N, B = input().split(' ')
    alpaList= list("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ")

    answer = 0
    for idx, n in enumerate(N):
        now_idx = alpaList.index(n)
        answer += n
