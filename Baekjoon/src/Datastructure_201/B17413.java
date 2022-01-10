package Datastructure_201;
import java.util.*;
import java.io.*;
public class B17413 {
	static StringBuilder sb = new StringBuilder();
	static String str;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		str = br.readLine();
		Stack<Character> stack = new Stack();
		while(str.length()!=0) {
			if(str.charAt(0)=='<') {
				inputStack(stack);//스택에 저장되어있는 역순으로 stringBuilder에 넣어주기
				cut();//현재위치부터 잘라서 cut함수에 넣어준다.
			}else if(str.charAt(0)==' ') {//공백일때
				inputStack(stack);//스택에 저장되어있는 역순으로 stringBuilder에 넣어주기
				sb.append(" ");
			}else {
				stack.add(str.charAt(0));
			}
			str =str.substring(1);
			
		}
		inputStack(stack);//스택에 저장되어있는 역순으로 stringBuilder에 넣어주기
		bw.write(sb.toString());
		bw.flush();
		bw.close();

	}
	static Stack<Character> inputStack(Stack st) {
		while(!st.isEmpty()) {//stack에 담겨있는거 sb에 넣어주기
			sb.append(st.pop());
		}
		return st;
	}
	static void cut() {
		int i=0;
		while(str.charAt(i)!='>') {
			sb.append(str.charAt(i));
			i++;
		}
		sb.append(str.charAt(i));
		str = str.substring(i);
	}
}


