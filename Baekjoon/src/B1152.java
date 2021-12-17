import java.util.*;
public class B1152 {
	public static void main(String[] args){
		//왼쪽에 문자가 있고 오른쪽에 공백이 하나 있으면 단어 1개로 볼 수있다.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();//공백까지 입력 받기
		char arr[] = str.toCharArray();
		int count = 0;//단어 개수 
		//공백의 아스키 코드 값은 32 
		for(int i=0;i<arr.length-1;i++) {
			int ascNow = arr[i];//현재 아스키 코드 저장
			int ascNext = arr[i+1];//다음 아스키 코드값 저장
			if(ascNow !=32 && ascNext ==32) {
				//현재는 문자고 다음이 공백일 때 
				count++;
			}
		}
		//마지막 문자로 끝나면 현재 count에서 +1해주어야 하고
		//마지막이 공백으로 끝나면 count는 그대로 유지된다.
		if(arr[arr.length-1] !=32) {
			count++;
		}
		System.out.println(count);
	
	}
}
