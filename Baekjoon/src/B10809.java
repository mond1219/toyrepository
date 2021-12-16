import java.util.Scanner;
public class B10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number[] = new int[26];
		//배열 초기값 설정
		for(int i=0;i<number.length;i++) {
			number[i]=-1;
		}
		
		String str = sc.next();
		char strArray[] = str.toCharArray();//글자 쪼개서 넣어줄 배열선언
		
		
		//문자 ->아스키코드로 변환 무슨 몇번째 알파벳인지 알아내기
		for(int i=0;i<str.length();i++){
			int ascNum = strArray[i];//문자의 아스키 코드 저장
			if(number[ascNum%97]==-1) {//첫 위치만 저장하기 위해서
				number[ascNum%97]=i;//알파벳이 존재하는 배열에
				//위치 숫자 저장
			}
		}
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]+" ");
		}
	}
}
