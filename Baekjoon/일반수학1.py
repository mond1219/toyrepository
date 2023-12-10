# 진법 변환
# https://www.acmicpc.net/problem/2745

def numChange():
    N, B = input().split(' ')
    alpaList= list("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ")

    answer = 0
    for idx, n in enumerate(N):
        now_idx = alpaList.index(n)
        answer += n

# 진법 변환2
# https://www.acmicpc.net/problem/11005

def numChange2():

    N, B = input().split(' ')
    N = int(N)
    B = int(B)
    alpaList= list("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ")

    answer =''
    while N > 0:
        answer += str(alpaList[N%B])
        N = N//B
        print(answer)
