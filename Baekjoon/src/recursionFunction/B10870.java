package recursionFunction;
import java.util.*;
public class B10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(pibo(sc.nextInt()));
	}
	static int pibo(int number) {
		if(number==0) {
			return 0;
		}else if(number==1) {
			return 1;
		}
		return pibo(number-1)+pibo(number-2);
	}
}
