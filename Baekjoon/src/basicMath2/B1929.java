package basicMath2;
import java.util.*;
public class B1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		while(min<=max) {
			if(max == 1) {
				break;
			}else if(min == 1) {
				min++;
			}
			int data = check(min);
			if(data==-1) {//소수가 아닐때
				min++;
			}else {//소수일때
				System.out.println(data);
				min++;
			}
		}
	}
	static int check(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i == 0) {//소수X
				return -1;
			}
		}
		//소수일때 
		return num;
	}
}
