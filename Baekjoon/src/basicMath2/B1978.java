package basicMath2;
import java.util.*;
public class B1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int sum=0;
		for(int i=0;i<test;i++) {
			int num = sc.nextInt();
			if(check(num)== true) {
				sum++;
			}
		}
		System.out.println(sum);
	}
	static boolean check(int number) {
		if(number ==1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i ==0) {
				return false;
			}
		}
		return true;
	}
}
