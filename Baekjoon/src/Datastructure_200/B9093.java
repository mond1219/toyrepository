package Datastructure_200;
import java.util.*;
public class B9093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		
		
		 for (int i = 0; i < count; i++) {
	            String str = sc.nextLine() + "\n"; 
	            Stack st = new Stack<>();

	            for (int j = 0; j < str.length(); j++) {
	                if (str.charAt(j) == ' ' || str.charAt(j) == '\n') { 
	                    while (!st.empty()) { 
	                        sb.append(st.pop()); 
	                    }
	                    sb.append(str.charAt(j)); 
	                } 
	                else {
	                    st.add(str.charAt(j)); 
	                }
	            }
	        }
		System.out.println(sb.toString());
	}
}
