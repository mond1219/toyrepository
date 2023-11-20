# 프로그래머스 재귀 문제 모음 

# 치킨 쿠폰
# https://school.programmers.co.kr/learn/courses/30/lessons/120884
# 스스로 풀다보니 재귀로 안풀어졌다,,
def coupon(chicken):
    cpCnt = chicken
    while chicken >= 10:
        cpCnt += int(chicken/10)
        chicken = int(chicken/10) + int(chicken%10)
    return int(cpCnt/10)
