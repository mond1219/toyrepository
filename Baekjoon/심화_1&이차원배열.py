# 팰린드롬인지 확인하기 
# https://www.acmicpc.net/problem/10988

def palindrom():
    str = input()
    check = True
    while len(str) > 1:
        if str[0] != str[-1]:
            print(0)
            check = False
            break
        else:
            str = str[1:len(str) - 1]
    if check :
        print(1)

# 별찍기-7
# https://www.acmicpc.net/problem/2444
def printStar():
    n = int(input())

    for row in range(1, n+1):
        str = ''
        for i in range(0, n-row):
            str += ' '
        for star in range(0, 1+2*(row-1)):
            str += '*'
        print(str)
    for row in range(1, n):
        str = ''
        for i in range(0, row):
            str += ' '
        for star in range(0, (2*n-1)-(row*2)):
            str += '*'
        print(str)

# 킹, 퀸, 룩, 비숍, 나이트, 폰
# https://www.acmicpc.net/problem/3003

def nite():
    black = [1, 1, 2, 2, 2, 8]
    white = input().split(' ')
    answer = ''
    for idx, now in enumerate(white):
        if int(now) != black[idx]:
            answer += str(black[idx] - int(now))+' '
        else:
            answer +=  '0 '
    print(answer)
    
# 그룹 단어 체커
# https://www.acmicpc.net/problem/1316

def checker():
    n = int(input())
    answer  = n
    for i in range(0, n):
        str = input()
        stack = []
        strSet = set()
        while len(str) > 0:
            now = str[0]
            if len(stack) == 0:
                stack.append(now)
            elif now != stack[-1]:
                checkStr = stack.pop(-1)
                if checkStr not in strSet:
                    strSet.add(checkStr)
                    stack.append(now)
                else:
                    str = ''
                    answer -= 1
            str = str[1:]
        if len(stack) > 0 and stack[-1] in strSet:
            answer -= 1
    print(answer)

# 너의 평점은
# https://www.acmicpc.net/problem/25206

def yournum():
    check = {"A+": 4.5, "A0":4.0, "B+":3.5, "B0":3.0, "C+":2.5, "C0":2.0, "D+":1.5,"D0":1.0,"F":0}
    total = 0
    ans = 0
    for _ in range(0,20):
        now = input().split(' ')

        if now[2] =="P":
            continue
        else:
            total += float(now[1])
            ans += float(now[1]) * check[now[2]]
    print(round(ans/total),6)

# 크로아티아 알파벳
# https://www.acmicpc.net/problem/2941

str = input()
cnt = 0
while len(str) > 1:
    now = str[0]
    if now == 'c':
        if str[1] in ['=', '-']:
            str = str[1:]
    elif now == 'd':
        if str[1] == '-':
            str = str[1:]
        elif str[1:3] == 'z=':
            str = str[2:]
    elif now == 'l' or now == 'n':
        if str[1] == 'j':
            str = str[1:]
    elif now == 's' or now =='z':
        if str[1] == '=':
            str = str[1:]

    cnt += 1
    str = str[1:]
    
print(cnt+len(str))

# 이차원 배열 
# https://www.acmicpc.net/problem/2738
def hangAdd():
    n, m = input().split(' ')
    first = []
    answer = ''
    for nRow in range(0,2*int(n)):
        nowHang = input().split(' ')
        if nRow < int(n):
            first.append(nowHang)
        else:
            # first 배열과 연산 시작
            for l in range(0, int(m)):
                answer += str(int(first[nRow-int(n)][l]) + int(nowHang[l])) + ' '
            answer += '\n'
    print(answer)

# 세로 읽기
# https://www.acmicpc.net/problem/10798

def colRead():
    inputArray = []
    for _ in range(0,5):
        now = input()
        inputArray.append(now)
    answer = ''
    for i in range(0,15):
        for j in range(0,5):
            if len(inputArray[j]) > i:
                answer += inputArray[j][i]
    print(answer)
