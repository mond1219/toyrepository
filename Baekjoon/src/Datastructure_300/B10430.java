package Datastructure_300;

import java.io.*;
public class B10430{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		String[] strArr = str.split(" ");
		int arr[] = new int[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		bw.write((arr[0]+arr[1])%arr[2]+"\n");
		bw.write(((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]+"\n");
		bw.write((arr[0]*arr[1])%arr[2]+"\n");
		bw.write(((arr[0]%arr[2])*(arr[1]%arr[2]))%arr[2]+"\n");
		bw.flush();
		bw.close();
	}
}
