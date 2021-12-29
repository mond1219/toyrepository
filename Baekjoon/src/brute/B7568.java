package brute;
import java.util.*;
public class B7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int arr[][] = new int[count][2];
		int rank[] = new int[count];
		for(int i=0;i<count;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		for(int i=0;i<count;i++) {
			//i행 배열을 기준으로 하여 i행보다 등치가 큰사람 count 
			int k=0;//비교할 행순서 
			while(true) {
				if(k==i && k != count-1) {
					//기준행과 비교행이 같고 배열의 크기보다 k가 작을경우 
					k++;
				}else if(k==i && k == count-1) {//비교행과 기준행 같고 마지막 배열 순서일경우
					break;
				}
				if(arr[i][0]<arr[k][0] && arr[i][1]<arr[k][1]) {//기준행보다 키, 몸무게 다 큰 행마다 ++
					rank[i]++;
				}
				k++;
				if(k==count) {//더이상 비교할 행이 없을경우
					break;
				}
			}
			
		}
		for(int i=0;i<rank.length;i++) {
			System.out.print(rank[i]+1+" ");
		}
	}
}
