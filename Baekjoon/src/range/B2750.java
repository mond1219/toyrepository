package range;
import java.util.*;
public class B2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[] = new int[count];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {//count->count-1->count-2
			for(int i=1;i<arr.length-j;i++) {
				if(arr[i-1]>arr[i]) {//앞에 있는게 더 크다면
					int temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
}
