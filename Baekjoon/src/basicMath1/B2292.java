package basicMath1;
import java.util.*;
public class B2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		int i =0;
		if(inputNum==1) {
			i=0;
		}else {
			inputNum=inputNum-1;//1을 빼주어야 7,19,37등 경계에 있는 숫자들이 1칸씩 더 늘어나지 않게 된다.
			do {
				i++;
				inputNum = inputNum-i*6;
				
			}while(inputNum>0);
		}
		System.out.println(i+1);
	}
}
