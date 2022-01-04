package Datastructure_200;
import java.util.*;
public class B1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[] = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = sc.nextInt();
		}
		int i=1;
		int j=0;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<Integer>();
		while(true) {
			if(i<=arr[j]) {
				st.push(i);
				i++;
				sb.append("+\n");
			}else if(st.peek()==arr[j]) {
				st.pop();
				j++;
				sb.append("-\n");
			}else if(st.peek()>arr[j]) {
				System.out.println("NO");
				break;
			}
			if(j==count) {
				System.out.println(sb.toString());
				break;
			}
		}
	}
}
