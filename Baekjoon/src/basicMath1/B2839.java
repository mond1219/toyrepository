package basicMath1;
import java.util.*;
public class B2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();//입력받는 무게
		int i=0;
		while(true) {
			int fwe=weight;//
			fwe = fwe-5*(weight/5-i);//맥시멈 5키로 주머니 개수 3,2,1순으로 줄여가기
			
			if(fwe%3==0) {
				weight = (weight/5-i)+fwe/3;//주머니 총개수
				break;
			}else if((weight/5-i)==0) {
				//주머니 5키로 0개 일때도 시도했을때 딱 나누어 떨어지지 않을때
				weight=-1;
				break;
			}else {
				i++;
			}
		}
		System.out.println(weight);
	}
}
