package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B10844 {
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());//num자리 숫자? 
		int sum[][] = new int[num+1][10];
		sum[1][0]=0;
		for(int i=1;i<10;i++) {
			sum[1][i]=1;
		}
		
		for(int i=2;i<=num;i++) {
			sum[i][0] = sum[i-1][1];//0이 될때는 1로 끝나는 숫자일때만
			for(int j=1;j<=8;j++) {
				sum[i][j]=(sum[i-1][j-1]+sum[i-1][j+1])%1000000000;
			}
			//9로끝날때는 
			sum[i][9] = sum[i-1][8];//9가 될때는 8로 끝나는 숫자일때만 가능 
		}
		int result=0;
		for(int j=0;j<=9;j++) {
			result = (result +sum[num][j])%1000000000;
		}
		System.out.println(result);
	}
}
