package Datastructure_300;
import java.util.*;
public class B1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println(factory(number));
		String[] result = (factory(number)+"").split("");
		Stack<String> stack = new Stack<String>(); 
		for(String s : result) {
			stack.add(s);
		}
		int count =0;
		while(!stack.isEmpty()) {
			if(stack.pop().equals("0")) {
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
		
	}
	static int factory(double num) {
		if(num ==0) {
			return 1;
		}
		System.out.println((int)(num*factory(num-1)));
		return (int)(num*factory(num-1));
	}
}
