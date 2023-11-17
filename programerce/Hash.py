# 전화번호 목록
# https://school.programmers.co.kr/learn/courses/30/lessons/42577

# sort 풀이
def numberList1(phone_book):
  phon_book.sort()
  for idx in range(len(phone_book)-1):
      if phone_book[idx] == phon_book[idx+1][:len(phone_book)]:
        return False
  return True
  
# 해시 풀이 
def numberList2(phone_book):
    map = {}
    for now in phone_book:
        map[now]= 1

    for nums in phone_book:
        start = ""
        for num in nums:
            start += num

            if start in map and start != nums:
                return False
    return True
