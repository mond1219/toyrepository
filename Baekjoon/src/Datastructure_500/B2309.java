package Datastructure_500;

import java.util.Arrays;
import java.util.Scanner;

public class B2309 {
	static int arr[] = new int[9];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		//9명 난쟁이 키 입력받기 
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum +=arr[i];//합산구하기
		}
		find(sum);
		Arrays.sort(arr);
		
		for(int i=2;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}
	
	static int find(int sum) {
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if(sum -arr[i] -arr[j] == 100) {
					arr[i] = -1;
					arr[j] = -1;
					return 0;
				}
			}
		}
		return 0;
	}
	
}
