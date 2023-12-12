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

# 세탁소 사장 동혁
# https://www.acmicpc.net/problem/2720

def lundryCoin():
    n = int(input())
    for _ in range(n):
        coin = int(input())

        answer = ''

        for c in [25, 10, 5, 1]:
            # Quarter
            if coin//c > 0:
                answer += str(coin//c) + ' '
                coin = coin % c
            else:
                answer += '0 '
        print(answer)

# 중앙 이동 알고리즘 
# https://www.acmicpc.net/problem/2903

def centeralg():
    n = int(input())
    i = 2
    for _ in range(n):
        i = i+(i-1)
    print(i*i)
