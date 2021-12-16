import java.util.Scanner;
public class B11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력받을 숫자개수
		int count = sc.nextInt();
		String num = sc.next();//숫자 입력받기
		int sum =0;//결과 저장
		for(int i =0;i<count;i++) {
			//문자열을 1개씩 잘라서 정수로 변환시켜 더해준다.
			sum = sum +Integer.parseInt(num.substring(i,i+1));
		}
		System.out.println(sum);
	}
}
