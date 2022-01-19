package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B16194 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count= Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		String strArr[] = str.split(" ");
		int money[] = new int[strArr.length+1];
		int sum[] = new int[count+1];
		for(int i=1;i<=strArr.length;i++) {
			money[i] = sum[i] =Integer.parseInt(strArr[i-1]);
		}
		
		for(int i=1;i<=count;i++) {
			for(int j=1;j<=i;j++) {
				sum[i] = Math.min(sum[i], sum[i-j]+money[j]);
			}
		}
		
		System.out.println(sum[count]);
	}
}
