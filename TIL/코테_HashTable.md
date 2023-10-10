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
