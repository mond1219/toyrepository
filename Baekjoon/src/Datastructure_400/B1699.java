package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1699 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		int maxSqr = (int)Math.sqrt(num);
		int dp[] = new int[num+1];
		for(int i=0;i<=num;i++) {
			dp[i] = i;
		}
		for(int i=1;i<=num;i++) {
			for(int j = 1;j*j<=i;j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		
		System.out.println(dp[num]);
	}
	
}
