package basicMath2;
import java.util.*;
public class B4153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> li = new ArrayList<Integer>();
		while(true) {
			int arr[] = new int[3];
			
			arr[0]=sc.nextInt();
			arr[1]=sc.nextInt();
			arr[2]=sc.nextInt();
			if(arr[0]==0 && arr[1]==0 && arr[2]==0) {
				break;
			}else {
				for(int i=1;i<3;i++) {
					//완전 정렬할 필요가 없다 제일 긴 길이가 arr[2]로 가기만 하면 되기 때문에
					if(arr[i]<arr[i-1]) {
						int temp = arr[i-1];
						arr[i-1]=arr[i];
						arr[i]=temp;
					}
				}
				li.add(arr[0]);
				li.add(arr[1]);
				li.add(arr[2]);
			}
		}//입력을 쭉 받고
		ListIterator<Integer> i = li.listIterator();
		while(i.hasNext()) {
			check(i.next(),i.next(),i.next());
		}
		
	}
	static void check(int a,int b, int c){
		if(Math.pow(c, 2) == Math.pow(a, 2)+ Math.pow(b, 2)) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}
}
