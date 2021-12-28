package recursionFunction;
import java.util.*;
public class B11729 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.println(Math.pow(2, count)-1);
		hanoi(count,1,2,3);
	}
//	static int hanoicount(int num) {
//		if(num==1) {
//			return 1;
//		}
//		return 2*hanoicount(num-1)+1;
//	}
	                          //시작, 거치는 곳,    final위치
	static void hanoi(int num,int one,int two,int three) {
		if(num==1) {
			System.out.println(one+" "+three);
			return;
		}
		//1에서 2번째로 원판 옮기기
		hanoi(num-1,one,three,two);
		
		//마지막 원판 1에서 3으로 옮기기
		System.out.println(one+" "+three);
		
		//2에 있는 원판들 3으로 옮기기
		hanoi(num-1,two,one,three);
		
	}
}
