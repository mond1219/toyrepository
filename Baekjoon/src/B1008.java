import java.util.Scanner;

public class B1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형으로 입력받기
		int a = sc.nextInt();
		int b = sc.nextInt();
		//계산결과는 실수형으로 
		double dop = a/b;
		System.out.println(dop);
		//하지만 결과는 0.0이런식으로 나온다,,
	}

}
