import java.util.Scanner;
public class B1065 {
	
	static int Hansu(int a) {
		int han=0;
		if(a<100) {//두자리숫자이하는 모두 한수이다.
			han=a;
		}else {//입력받은 숫자가 세자리이상일때 
			while(a>99) {
				int inputNum = a;
				int three = inputNum/100;//100자리 숫자 저장
				inputNum=inputNum-three*100;
				int two = inputNum/10;//2자리 숫자 저장
				inputNum=inputNum-two*10;//1의 자리 숫자
				if(three-two == two-inputNum) {//간격이 같다면
					han=han+1;
				}
				a--;
			}
			han=han+99;
			
		}
		return han;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Hansu(num));
	}

}
