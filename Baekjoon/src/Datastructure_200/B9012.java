package Datastructure_200;
import java.util.*;
public class B9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();//입력받을 횟수 카운트
		sc.nextLine();// Enter입력 처리
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<count;i++) {
			sb.append(check(sc.nextLine()));
		}
		System.out.println(sb.toString());
	}
	
	static String check(String str) {
		Stack st = new Stack();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='(') {//(일때는 stack에 넣어준다.
				st.add(str.charAt(i));
			}else if(str.charAt(i)==')' && !st.isEmpty()) {
				//')'이랑 짝이되는 (를 pop 제거해준다.
				st.pop();
			}else if(str.charAt(i)==')' && st.isEmpty()) {
				//')'이랑 짝이 되는 '('가 없다. NO출력
				return "NO\n";
			}
		}
		if(st.isEmpty()) {//stack이 비어있으면 
			return "YES\n";
		}else {
			return "NO\n";
		}
		
	}
}
