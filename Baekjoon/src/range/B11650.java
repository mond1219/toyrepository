package range;
import java.util.*;
public class B11650 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[][] = new int[count][2];
		for(int i=0;i<count;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		Arrays.sort(arr, (e1,e2)-> {
			if(e1[0]==e2[0]) {
				return e1[1]-e2[1];
			}else {
				return e1[0]-e2[0];
			}
		});
		for(int i=0;i<count;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
