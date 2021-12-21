package basicMath1;
import java.util.*;
public class B1712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startM = sc.nextInt();
		int oneM = sc.nextInt();
		int selM = sc.nextInt();
		
		if(startM/(selM-oneM)<0) {
			System.out.println(-1);
		}else {
			System.out.println(startM/(selM-oneM)+1);
		}
		
	}
}
