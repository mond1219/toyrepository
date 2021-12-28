package recursionFunction;
import java.util.*;
public class B10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
	}
	static int factorial(int number) {
		if(number==0) {
			return 1;
		}
		return number*factorial(number-1);
	}
}
