package basicMath2;
import java.util.*;
public class B9020 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int arr[] = new int[test];
		for(int i=0;i<test;i++) {
			arr[i] =sc.nextInt(); 
		}
		for(int i=0;i<test;i++){
			int j=0;
			while(true) {
				System.out.println("입력숫자 >"+arr[i]+"j값>"+j);
				if(check(arr[i]/2-j,arr[i]/2+j)) {
					//이렇게 인덱스를 넣어주면 제일 처음 나온 소수 두개의 값은 차가 가장 작다.
					//리스트에 담아준다.
					System.out.println(arr[i]/2-j+" "+(arr[i]/2+j));
					break;
				}
				j++;
			}
			
		}
	}
	static boolean check(int num1, int num2) {
		for(int i=2;i<=Math.sqrt(num1);i++) {
			if(num1%i==0) {//소수가 아닐때
				return false;
			}
		}
		for(int i=2;i<=Math.sqrt(num2);i++) {
			if(num2%i==0) {//소수가 아닐때
				return false;
			}
		}
		return true;//둘다 소수일때
		
	}
}
