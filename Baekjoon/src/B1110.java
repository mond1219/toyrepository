import java.util.Scanner;

public class B1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputNum = sc.nextInt();//문자 입력 저장
		int sycle=0;//반복 횟수
        int newNum = inputNum;//새로운 숫자
        do{
            int a = newNum%10;//뒷자리수 저장
            int b = newNum/10;//앞자리수 저장
            newNum = a+b;//새로운 숫자 이거를 뒷자리에 넣어야함
            //2자리 숫자일 수도 있으니 뒷자리수만 뽑아내기
            newNum = a*10+newNum%10;//전에 사용하던 번호 뒷자리 10의 자리 숫자
            sycle++;//반복횟수 증가
            if(inputNum ==newNum){
                System.out.println(sycle);
                //나가라
                break;
            }
        }while(inputNum>0);
	}
}

