package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2225 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arrStr[] = str.split(" ");
		int n = Integer.parseInt(arrStr[0]);
		int k = Integer.parseInt(arrStr[1]);
		
		long dp[][] = new long[201][201];
		
		//dp 초기값 셋팅
		for(int i=0; i<201; i++){
			dp[i][0] = 1;
			dp[1][i] = 1;
		}
		
		for(int i=1; i<201; i++){
			dp[2][i] = i+1;
		}
		//dp 초기값 세팅 끝==========
		
		for(int i=3; i<201; i++){
			for(int j=1; j<201; j++){
				for(int l=0; l<=j; l++){
						dp[i][j]+= dp[i-1][j-l]%1000000000;
				}
			}
		}
		
		System.out.println(dp[k][n]%1000000000);

			
	}
}
