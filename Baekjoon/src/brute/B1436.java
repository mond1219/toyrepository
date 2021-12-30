package brute;
import java.util.*;
public class B1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		check(sc.nextInt());
	}
	static void check(int num) {
		int count = 1;
		int number=666;
		while(num != count) {
			number++;
			if(String.valueOf(number).contains("666")) {
				count++;
			}
		}
		System.out.println(number);
	}
}
