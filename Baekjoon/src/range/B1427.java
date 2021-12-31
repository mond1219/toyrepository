package range;
import java.util.*;
public class B1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count[] = new int[10];
		while(number>0) {
			count[number%10]++;
			number = number/10;
		}
		for(int i=9;i>=0;i--) {
			for(int j=0;j<count[i];j++) {//저장된 수만큼 index를 반복출력한다.
				System.out.print(i);
			}
		}
		System.out.println();
		
	}
}
