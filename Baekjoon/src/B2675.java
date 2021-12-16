import java.util.Scanner;
public class B2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//케이스 개수 입력 받기
		int num = sc.nextInt();
		int reCount[] = new int[num];
		String str[] = new String[num];
		
		for(int i=0;i<num;i++) {
			reCount[i] = sc.nextInt();
			str[i] = sc.next();
		}
		for(int k=0;k<num;k++) {
			char strArray[] =str[k].toCharArray();//문자열을 배열에 넣어주기
			
			for(int i=0;i<str[k].length();i++) {//글자 길이만큰 반복
				
				for(int j=0;j<reCount[k];j++) {//반복횟수만큼 반복
					System.out.print(strArray[i]);
				}
			}
			System.out.println();
		}
	}
}
