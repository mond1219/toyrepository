package basicMath1;

import java.util.Scanner;

public class B1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();
		int i=1;
		int k=1;//반복횟수 카운트
		while(true) {
			if(inputNum<=i) {
				break;
			}
			k++;
			i=i+k;
		}
		//몇번째 숫자인지 카운트 하기 위해서
		//분모 분자의 합이 k이고
		//k번째 줄에 있는 숫자중에 제일 작은 수는
		//만약 입력받은 숫자가 15라면 
		//k=5,i=15, inputNum=15
		//count=inputNum-(i-k)이다.
		//15-10 ->5번째숫자 
		//count/(k+1-count)
		int count = inputNum-(i-k);
		if(k%2==0) {//짝수일때
			System.out.println(count+"/"+(k+1-count));
		}else {//홀수일때 
			System.out.println((k+1-count)+"/"+count);
		}
	}
}
