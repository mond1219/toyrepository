package Datastructure_300;
import java.util.*;
public class B2004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		//분자의 2의 개수-분모의 2개수 
		int count2 = num2Count(num1)-num2Count(num2)-num2Count(num1-num2);
		int count5 = num5Count(num1)-num5Count(num2)-num5Count(num1-num2);
		if(count2<count5) {
			System.out.println(count2);
		}else {
			System.out.println(count5);
		}
	}
	static int num5Count(int num) {//소인수 5의 개수
		int count =0;
		while(num>=5) {
			count = count+num/5;
			num = num/5;
		}
		return count;
	}
	static int num2Count(int num) {//소인수 2의 개수
		int count=0;
		while(num>=2) {
			count=count+num/2;
			num = num/2;
		}
		return count;
	}
}
