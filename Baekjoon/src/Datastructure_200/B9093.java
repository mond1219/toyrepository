package Datastructure_200;
import java.util.*;
public class B9093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String arr[] = new String[count];
		StringBuilder sb = new StringBuilder();
		
		sc.nextLine();//Enter 입력 처리
		for(int i=0;i<count;i++) {
			String str = sc.nextLine()+"\n";
			Stack st = new Stack();
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)==' ' || str.charAt(j)=='\n') {
					//띄어쓰기 일때 
					while(!st.isEmpty()) {
						sb.append(st.pop());
					}
					sb.append(str.charAt(j));
				}else {
					st.add(str.charAt(j));
				}
			}
		}
		System.out.println(sb.toString());
	}
}
