import java.util.Scanner;
class B1157{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();//문자열 입력받기
        char strArr[] = str.toCharArray();//입력받은 문자열 배열로 변환
        int alphabet[] = new int[26];//문자 개수 카운트 배열
        
        for(int i=0;i<str.length();i++){//입력받은 문자 개수만큼 반복
            int ascStr =  strArr[i];//문자의 아스키코드 받기
            
            if(64<ascStr && ascStr<91){//대문자일때
                alphabet[ascStr%65]++;
            }else{//소문자일때
                alphabet[ascStr%97]++;
                
            }
        }
        
        int max = alphabet[0];//초기값으로 a의 개수 설정
        int index = 0;
        for(int i=1;i<26;i++){
            if(alphabet[i]>max){
                max=alphabet[i];//개수 저장
                index =i;//해당하는 알파벳 배열 index 저장
            }else if(alphabet[i] == max) {//개수가 중복인 숫자가 있으면 
            	index=-2;
            }
        }
        System.out.println((char)(index+65));//가장 개수가 많은 문자 출력
    }
}
