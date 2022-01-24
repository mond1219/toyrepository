package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1912 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String strArr[] = str.split(" ");
		
		long arr[] = new long[count];
		for(int i=0;i<count;i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		long dp[] = new long[count];
		dp[0] = arr[0];//기본 값 설정
		for(int i=1;i<dp.length;i++) {
			dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
		}
		long max = dp[0];
		for(int i=1;i<count;i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
	}
}
