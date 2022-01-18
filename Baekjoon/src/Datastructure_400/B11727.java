package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11727 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] count = new int[num+2];
		count[0] = 1;
		count[1] = 1;
		count[2] = 3;
		System.out.println(check(count,num));
		
	}
	static int check(int[] count, int num) {
		for(int i=2;i<=num;i++) {
			count[i] = (count[i-1]+2*count[i-2])%10007;
		}
		return count[num];
	}
}
