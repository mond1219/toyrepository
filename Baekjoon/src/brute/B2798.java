package brute;
import java.util.*;
public class B2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int max = sc.nextInt();
		int arr[] = new int[count];
		for(int i=0;i<count;i++) {
			arr[i] = sc.nextInt();
		}
		check(arr,max);
	}
	static void check(int arr[],int max) {
		int temp = 0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					int result = arr[i]+arr[j]+arr[k];
					
					if(result == max) {
						System.out.println(result);
						return;
					}
					if(result>temp && max>result) {
						temp = result;
					}
				}
			}
		}
		System.out.println(temp);
	}
}
