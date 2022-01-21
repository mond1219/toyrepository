package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11053 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		int[] arr = new int[str.length];
		for(int i=0;i<str.length;i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		int dp[] = new int[count];
		//초기값 세팅
		dp[0] = 1;
		for(int i=1;i<count;i++) {
			if(dp[i] == 0) {//초기 값 세팅
				dp[i]=1;
			}
			for(int j=0;j<=i;j++) {
				if(arr[i]>arr[j]) {//현재 인덱스 배열보다 작은 숫자들 찾기
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		int max=0;//최대값 설정
		for(int i=0;i<count;i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
		
	}
}
