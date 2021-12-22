package basicMath1;
import java.util.*;
public class B2869 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dayTime = sc.nextInt();//낮에 올라갈 수 있는 길이
		int nightTime = sc.nextInt();//밤에 내려가는 길이
		int hight = sc.nextInt();//막대높이
		int k=1;//날짜 카운트
		while(true){
			if(hight <= dayTime*k-nightTime*(k-1)) {
				System.out.println(k);
				break;
			}
			k++;
		}
		
	}
}
