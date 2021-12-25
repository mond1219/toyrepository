package basicMath2;
import java.util.*;
public class B4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> li = new LinkedList<Integer>(); 
		
		while(true) {
			int num = sc.nextInt();
			if(num==0) {
				break;
			}
			li.addLast(num);
		}
		ListIterator<Integer> i = li.listIterator();
		while(i.hasNext()) {
			int data =i.next();
			int count=0;
			for(int j=data+1;j<=data*2;j++) {
				if(check(j)){
					count++;//true면 소수 
				}//false면 소수X
			}
			System.out.println(count);
			
		}
	}
	static boolean check(int number) {
		for(int i=2;i<=Math.sqrt(number);i++) {
			if(number%i==0) {//소수X
				return false;
			}
		}
		return true;
	}
}
