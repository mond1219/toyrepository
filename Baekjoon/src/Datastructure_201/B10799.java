package Datastructure_201;
import java.util.*;
import java.io.*;
public class B10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();//괄호 입력받는 부분
		
		char[] arr = str.toCharArray();
		Stack<Integer> stack = new Stack<Integer>();
		
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] =='(') {
				stack.add(1);
			}else if(arr[i]==')') {
				stack.pop();//)를 만나면 무조건 레이저든 파이프든 pop해서 size를 줄여줘야한다.
				if(arr[i-1] =='(') {//레이저 일때 
					count+=stack.size();
				}else {//레이저가 아닐때 파이프의 끝이므로
					count+=1;
				}
			}
		}
		bw.write(count+"");
		bw.flush();
		bw.close();
	}
}
