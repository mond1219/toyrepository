package Datastructure_200;
import java.util.*;
public class B10845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int count = sc.nextInt();
		int first = 0;//첫번째 index
		int last = 0;//queue개수
		int arr[] = new int[count];
		
		for(int i=0;i<count;i++) {
			String order = sc.next();
			switch(order){
			case "push":
				arr[last]=sc.nextInt();
				last++;
				break;
			case "pop"://수정하기 
				if(last != first) {
					System.out.println(arr[first]);
					arr[first]=0;
					first++;
				}else {
					System.out.println("-1");
				}
				break;
			case "size":
				System.out.println(last-first);
				break;
			case "empty":
				if(last != first) {
					System.out.println("0");
				}else {//존재할때
					System.out.println("1");
				}
				break;
			case "front":
				if(last != first) {//큐가 비어있지 않으면
					System.out.println(arr[first]);
				}else {
					System.out.println("-1");
				}
				break;
			case "back":
				if(last != first) {
					System.out.println(arr[last-1]);
				}else {
					System.out.println("-1");
				}
				break;
			}
		}
	}
}
