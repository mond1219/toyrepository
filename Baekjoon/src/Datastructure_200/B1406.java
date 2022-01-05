package Datastructure_200;
import java.util.*;
import java.io.*;
public class B1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		Stack<String>left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		String arr[] = str.split("");
		for(String s : arr) {
			left.push(s);
		}
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			String order = br.readLine();
			switch(order.charAt(0)){
			case 'L':
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
				break;
			case 'D':
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
				break;
			case 'B':
				if(!left.isEmpty()) {
					left.pop();
				}
				break;
			case 'P':
				left.push(String.valueOf(order.charAt(2)));
				break;
			default:
				break;
			}
		}
		while(!left.isEmpty()) {//오른쪽 stack으로 다 옮겨주고
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}
		bw.flush();
		bw.close();
	}
}
