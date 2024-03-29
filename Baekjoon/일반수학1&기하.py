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


# 직사각형
# https://www.acmicpc.net/problem/27323
a = int(input())
b = int(input())

print(a*b)

# 수학은 체육과목입니다. 
# https://www.acmicpc.net/problem/15894
# 위: n, 왼: n, 오: n, 아: n = n*4
n = int(input())
print(n*4)

# 대지
# https://www.acmicpc.net/problem/9063
def daji():
    n = int(input())
    minX = 0
    maxX = 0
    minY = 0
    maxY = 0
    for _ in range(n):
        x, y = input().split(' ')
        X = int(x)
        Y = int(y)
        if _ == 0:
            minX = X
            minY = Y
            maxX = X
            maxY = Y
        else:
            minX = min(minX, X)
            maxX = max(maxX, X)
            minY = min(minY, Y)
            maxY = max(maxY, Y)

    print((maxX - minX) * (maxY - minY))

# 삼각형 외우기 
# https://www.acmicpc.net/problem/10101
def triangle():
    answer = 0
    cnt = set()
    for _ in range(3):
        n = int(input())
        answer += n
        cnt.add(n)

    if answer == 180:
        if len(cnt) == 1:
            print("Equilateral")
        elif len(cnt) == 2:
            print("Isosceles")
        else:
            print("Scalene")
    else:
        print("Error")


# 삼각형과 세변 
# https://www.acmicpc.net/problem/5073

def triangleLen():
    while True:
        a, b, c = map(int, input().split(' '))
        if a == b == c == 0:
            break
        if sum((a, b, c)) - max((a, b, c)) <= max((a, b, c)):
            print("Invalid")
        elif a == b == c:
            print("Equilateral")
        elif a == b or b == c or a == c:
            print("Isosceles")
        else:
            print("Scalene")

# 세 막대
# https://www.acmicpc.net/problem/14215
def macdea():
    nums = list(map(int, input().split(' ')))
    nums.sort()
    maxLen = nums[0] + nums[1]
    print( maxLen + min(maxLen-1, nums[2]))
