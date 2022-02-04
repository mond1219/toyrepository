package Datastructure_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B3085 {
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		count = Integer.parseInt(br.readLine());
		char[][] arr = new char[count][count];
		
		for(int i=0;i<count;i++) {
			String str = br.readLine();
			char arrChar[] = str.toCharArray();
			for(int j=0;j<arrChar.length;j++) {
				 arr[i][j]= arrChar[j];
			}
		}
		int max=0;
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if(j+1<count) {//오른쪽 문자와 자리 바꾸기 
					char temp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = temp;
					int check = check(arr);
					if(max<check) {
						max = check;
					}
					//확인 후 원상 복귀 하기 
					temp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = temp;
				}
				if(i+1<count) {//아래 문자와 자리 바꾸기 
					char temp = arr[i][j];
					arr[i][j] = arr[i+1][j];
					arr[i+1][j] = temp;
					int check = check(arr);
					if(max<check) {
						max = check;
					}
					//확인후 원상 복귀
					temp = arr[i][j];
					arr[i][j] = arr[i+1][j];
					arr[i+1][j] = temp;
				}
			}
		}
		System.out.println(max);
		
	}
	static int check(char[][] temp) {
		int ans = 1;
		int max = 1;
		for(int i=0;i<count;i++) {
			
			for(int j=1;j<count;j++) {
				if(temp[i][j] == temp[i][j-1]) {//행으로 같은것 끼리 count하기
					ans+=1;
				}else {
					ans =1;
				}
				if(ans>max) {
					max = ans;
				}
			}
			ans =1;
			for(int j=1;j<count;j++) {
				if(temp[j][i] == temp[j-1][i]) {
					ans++;
				}else {
					ans =1;
				}
				if(ans>max) {
					max = ans;
				}
			}
		}
		return max;
	}
	

}
