package Datastructure_201;
import java.util.*;
import java.io.*;
public class B17298 {
	static int intArr[];
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		String result = br.readLine();
		String arr[] = result.split(" ");
		Queue<Integer> que = new LinkedList<Integer>();
		intArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			que.add(Integer.parseInt(arr[i]));
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		for(int i=0;i<intArr.length;i++) {
			int first = que.remove();
			sb.append(check(i+1,first)+" ");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();	
	}
	static int check(int j, int one) {
		for(;j<intArr.length;j++) {
			if(intArr[j]>one) {
				return intArr[j];
			}
		}
		return -1;
	}
	
}
