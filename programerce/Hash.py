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


# 의상
# https://school.programmers.co.kr/learn/courses/30/lessons/42578
def clothe(clothes):
    clotheMap = {}
    for row in clothes:
        clotheName  = row[0]
        i       = row[1]
        if i not in clotheMap.keys():
            clotheMap[i] = [clotheName]
        else:
            clotheMap[i].append(clotheName)
    answer = 1
    for key, value in clotheMap.items():
        answer = answer * (len(value)+1) # 옷의 개수 + 해당 옷의 종류를 안입고 있을 경우의 수
    return answer -1 # 모두 0인경우의 수 빼주기 
