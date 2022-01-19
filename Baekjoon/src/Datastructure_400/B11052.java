package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11052 {
		static int[] money;
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		money = new int[str.length+1];
		for(int i=1;i<=str.length;i++) {
			money[i]=Integer.parseInt(str[i-1]);
		}
		int sum[] = new int[count+1];
		
		for(int i=1;i<=count;i++) {
			for(int k=1;k<=i;k++) {
				sum[i] = Math.max(sum[i], sum[i-k]+money[k]);
			}
		}
		System.out.print(sum[count]);
		
 	}

}
