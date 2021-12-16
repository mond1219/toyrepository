import java.util.Scanner;
public class B1065 {
	
	static int Hansu(int a) {
		int han=0;
		if(a<100) {//두자리숫자이하는 모두 한수이다.
			han=a;
		}else {//입력받은 숫자가 세자리이상일때 
			while(a>99) {
				//입력받은 숫자 문자열로 변환
				String inputNum = a+"";
				//입력받은 숫자 개수 체크
				int numLength = inputNum.length();
				int numArray[] = new int[numLength];
				int gap[] = new int[numLength-1];//자리수 사이에 간격 저장 배열
				
				for(int i=0;i<numLength;i++) {
					//숫자 앞자리 부터 1개씩 잘라서 정수로 변환하여 배열에 넣어주기 
					numArray[i] = Integer.parseInt(inputNum.substring(i,i+1));
					if(i>0) {
						gap[i-1]=numArray[i]-numArray[i-1];//숫자 사이의 간격 저장해주기
					}
				}
				//3자리 숫자 입력 받으면숫자 저장된 숫자들의 배열 index는 0,1,2 
				//gap은 2개 배열 index 0,1
				numLength = numLength-1;
				while(numLength>1) {
					if(gap[numLength-1]!=gap[numLength-2]) {
						break;
					}else {
						if(numLength==2) {//마지막 까지 전부 다 ture가 나왔다면
							han=han+1;
						}
						numLength--;
						
					}
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
