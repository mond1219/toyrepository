package Datastructure_201;
import java.util.*;
import java.io.*;
public class B17298 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		String result = br.readLine();
		String arr[] = result.split(" ");
		int intArr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<count;i++) {
			while(!stack.empty() && intArr[stack.peek()]<intArr[i]) {
				intArr[stack.pop()] = intArr[i];
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			intArr[stack.pop()] = -1;
		}
		for(int s:intArr) {
			sb.append(s+" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();	
	}
}
