출처 : https://www.nossi.dev/
# Hash Table
- Array List based (Open addressing)
- Find key O(1)
- 효율적인 탐색(빠른 탐색)을 위한 자료구조로써 key-value쌍의 데이터를 입력받는다. 
- 저장, 삭제, 검색의 시간복잡도는 모두 O(1)이다.

### to Sum 
- 23.10.11 Dictionary를 활용하여 다시 풀이

```python
class ToSum(object):
    def check(self, nums, target):
        keyDict = {}
        for num in nums:
            if target - num in keyDict:
                return keyDict[target - num]
            else:
                keyDict[num] = True
        return False
if __name__ == '__main__':
    nums = [2, 1, 5, 7]
    target = 4
    toSum = ToSum()
    print(toSum.check(nums, target))
```

### Longest Consecutive Sequence
23.10.12 정렬 후 diction로 증가 시키기

```python
class LongestSequence(object):
    def consecutive(self, nums):
        if len(nums) == 0:
            return 0
        # 정렬하고, max값 찾아주기
        nums.sort()
        numsDict = {} # beforeNumber : maxCnt
        max = 0
        for num in nums:
            if num -1 in numsDict:
                numsDict[num] = numsDict[num-1] + 1
                if max < numsDict[num-1] + 1:
                    max = numsDict[num-1] + 1
                del numsDict[num-1]
            else:
                numsDict[num] = 1

        return max
if __name__ == '__main__':
    sequence = LongestSequence()
    nums = [100, 4, 200, 1, 3, 2]
    print(sequence.consecutive(nums))
```
