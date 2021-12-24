package basicMath2;
import java.util.*;
public class B2581 {
	static int total=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int i=1;
		for(;min<=max;min++) {
			if(check(min) ==true) {
				if(i==1) {
					i=min;
				}
			}
		}
		if(total>0) {
			System.out.println(total);
			System.out.println(i);
		}else {
			System.out.println(-1);
		}
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
		total=total+number;
		return true;
	}
}
