package basicMath1;

import java.util.*;
public class B10250 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();//테스트 반복횟수
		int ans[] = new int[test];//결과
		
		for(int i=0;i<test;i++) {
			
			int hight = sc.nextInt();//건물 높이
			int width = sc.nextInt();//건물 너비
			int num = sc.nextInt();//몇번째 손님
			
			if(num%hight==0) {
				ans[i] = hight*100+(num/hight);
			}else {
				ans[i] = (num%hight)*100+(num/hight+1);
			}
		}
		//세로로 채워간다. num%hight가 0 이면 num/hight=width호수가 되게 된다.hight는 꼭대기인 hight그대로 
		//num%hight!=0이면 num/hight=width+1호수이고 num%hight가 hight가 된다.
		for(int i =0;i<test;i++) {
			System.out.println(ans[i]);
		}
	}
}
