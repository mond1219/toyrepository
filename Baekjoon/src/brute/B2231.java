package brute;
import java.util.*;
public class B2231 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		check(num);
	}
	static void check(int num) {
		if(num<10) {//한자리 숫자일때 
			if(num%2==0) {//짝수일때는 생성자 존재
				System.out.println(num/2);
			}else {//홀수일때는 생성자 존재 X
				System.out.println(0);
			}
		}else{
			
			int count =(num+"").length();//몇자리 숫자인지
			int search = num-count*9;//여기서부터 탐색하면 된다. 
			
			while(true) {
				int temp = search;
				int sum =0;
				for(int i=(search+"").length();i>0;i--){//생성자로 숫자조합해보는 for문 
					int data = temp/(int)(Math.pow(10, i-1));
					sum = sum +data;
					temp = temp-data*(int)(Math.pow(10, i-1));
				}
				if(num == search+sum) {//가장 작은 생성자 찾음 
					System.out.println(search);
					return;
				}else if(search == num) {//생성자가 없는 숫자.
					System.out.println(0);
					return;
				}else {
					search++;
				}
			}
		}
	}
}
