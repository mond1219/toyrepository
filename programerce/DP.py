# DP 프로그래머스 문제 모음

# 23.11.10 정수 삼각형 
# https://school.programmers.co.kr/learn/courses/30/lessons/43105
    def solution(triangle):
        memo = triangle[-1]
        start_row = len(triangle)-2
        for row in range(start_row, -1 , -1):
            for idx, now_num in enumerate(triangle[row]):
                left = memo[idx] + now_num
                right = memo[idx+1] + now_num
                memo[idx] = max(left, right)
        return memo[0]

triangle = [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
print(solution(triangle))
