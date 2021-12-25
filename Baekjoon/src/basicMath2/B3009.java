package basicMath2;
import java.util.*;
public class B3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][2];
		int x=0;
		int y=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//x좌표 찾기 3개중 1개만 있는 숫자가 x좌표
		if(arr[0][0]==arr[1][0]) {
			x=arr[2][0];
		}else if(arr[0][0]==arr[2][0]) {
			x=arr[1][0];
		}else {
			x=arr[0][0];
		}
		//y좌표찾기
		if(arr[0][1]==arr[1][1]) {
			y=arr[2][1];
		}else if(arr[0][1]==arr[2][1]) {
			y=arr[1][1];
		}else {
			y=arr[0][1];
		}
		System.out.println(x+" "+y);
		
	}
}
