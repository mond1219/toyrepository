package basicMath2;
import java.util.*;
public class B1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int min=0;
		if(arr[0]<arr[1]) {
			min=arr[0];
		}else {
			min=arr[1];
		}
		if(arr[2]-arr[0]<min) {
			min = arr[2]-arr[0];
		}
		if(arr[3]-arr[1]<min) {
			min = arr[3]-arr[1];
		}
		System.out.println(min);
		
	}
}
