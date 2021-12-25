package basicMath2;
import java.util.*;
public class B11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(true) {
			if(number == 1) {
				break;//1은 함수에 들어갈 필요 조차없다,,,
			}else if(check(number) == -1) {
				//이미 소수
				System.out.println(number);
				break;
			}else {//소수가 아니기 때문에 num보다 작은 소인수를 출력해준 후 
				//number를 소인수로 나눠준 값으로 변경해준다.
				System.out.println(check(number));
				number = number/check(number);
			}
						
		}
	}
	static int check(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i == 0) {
				return i;
			}
		}
		return -1;//소수일때 음수를 리턴
	}
}
