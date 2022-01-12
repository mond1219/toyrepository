package Datastructure_300;
import java.util.*;
public class B2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = gcd(a,b);
		System.out.println(c);//최대공약수
		System.out.println(a*b/c);//최소공배수
		

	}
	static int gcd(int num1,int num2) {
		if(num1<num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		while(num2!=0) {
			int c = num1%num2;//나머지
			num1 = num2;
			num2 = c;
		}
		
		return num1;//최대공약수
	}
}
