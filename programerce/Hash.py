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


# 베스트 앨범
# https://school.programmers.co.kr/learn/courses/30/lessons/42579
def best(genres, plays):
    count = {}
    idxMap  = {}
    generMap = {}
    for idx, i in enumerate(genres):
        if i not in count:
            count[i] = plays[idx]
            generMap[i] = [idx]
        else:
            count[i] += plays[idx]
            generMap[i].append(idx)
        idxMap[idx] = plays[idx]
    # 어떤 장르를 제일 먼저 해야하는가?  count의 value를 내림차순 정렬한 키값
    cntList= sorted(count.items(), key=lambda x:x[1], reverse=True)
    idxList = sorted(idxMap, key=lambda x:idxMap[x], reverse=True)

    answer = []
    for gener, count in cntList:
        generSet = set(generMap[gener])
        cnt = 1
        for max in idxList:
            if cnt >= 3:
                break
            if max in generSet:
                answer.append(max)
                cnt += 1

    return answer
