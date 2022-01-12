package Datastructure_201;
import java.util.*;
import java.io.*;
public class B17299 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int arr[] = new int[count];//입력받은 숫자 배열
		int counting[] = new int[1000001];//카운팅 배열
		
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(str[i]);
			counting[arr[i]]++;
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<count;i++) {
			while(!stack.isEmpty() && counting[arr[stack.peek()]]<counting[arr[i]]) {
				arr[stack.pop()]=arr[i];
			}
			stack.add(i);
		}
		while(!stack.isEmpty()) {
			arr[stack.pop()]=-1;
		}
		for(int i=0;i<count;i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
		
	}
}
