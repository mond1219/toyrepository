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

# 약수와 배수 
# https://www.acmicpc.net/problem/5086
def mulDiv():
    while True:
        f, s = input().split(' ')
        F = int(f)
        S = int(s)
        if F== 0 and S == 0:
            break
        if F < S and S%F == 0:
            print("factor")
        elif F > S and F%S == 0:
            print("multiple")
        else:
            print("neither")

# 약수 구하기 
# https://www.acmicpc.net/problem/2501

def getDiv():
    n, k = input().split(' ')
    N = int(n)
    K = int(k)

    answer = 0
    for now in range(1, N+1):
        if N % now == 0:
            K -= 1
            if K == 0:
                answer = now
    print(answer)

# 약수들의 합
# https://www.acmicpc.net/problem/9506

def sumDiv():
    while True:
        now = int(input())
        if now == -1:
            break

        divList= []
        for _ in range(1, now):
            if now % _ == 0:
                divList.append(_)
        if sum(divList) == now:
            answer = str(now) + ' = '
            for _ in divList:
                answer += str(_) + ' + '
            print(answer[:-2])
        else:
            print(str(now) + ' is NOT perfect.')
