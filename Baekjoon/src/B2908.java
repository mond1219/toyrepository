import java.util.*;
public class B2908 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		num1 = numFunction(num1);
		num2 = numFunction(num2);
		
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
	
	static int numFunction(int num) {
		int count=0;
		int j=1;
		for(int i=100;i>0;i=i/10) {
			count= count+(num/i)*j;
			num=num-(num/i)*i;
			j=j*10;
		}
		return count;
	}
}
