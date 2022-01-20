package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B15990 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count[] = new int[num];
		int max=0;
		for(int i=0;i<num;i++) {
			count[i] = Integer.parseInt(br.readLine());
			if(max<count[i]) {
				max=count[i];//입력 받은 숫자 중에서 가장 큰 값 설정
			}
		}
		//기본 값 셋팅
		long sum[][] = new long[max+1][4];
		sum[1][1]=1;
		sum[2][2]=1;
		sum[3][1]=1;
		sum[3][2]=1;
		sum[3][3]=1;
		
		for(int i=4;i<=max;i++) {//최대 값까지 배열 만들어 놓기 
			sum[i][1] = (sum[i-1][2]+sum[i-1][3])%1000000009;
			sum[i][2] = (sum[i-2][1]+sum[i-2][3])%1000000009;
			sum[i][3] = (sum[i-3][1]+sum[i-3][2])%1000000009;
		}
		
		for(int i=0;i<num;i++) {
			System.out.println((sum[count[i]][1]+sum[count[i]][2]+sum[count[i]][3])%1000000009);	
		}
	}
}
