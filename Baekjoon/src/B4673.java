
public class B4673 {
	
	static int dFunction(int n) {
		int sum=0;//나머지 연산
		int inputNum=n;//입력받은 생산자 숫자 저장
		while(n!=0) {
			sum = sum+ n%10;//10으로 나눈 나머지를 더해주기
			n =n/10;
		}
		sum = inputNum+sum;//원래 숫자랑 나머지들이랑 더해주기
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = new int[10001];//1~10000까지 있으므로
		
		for(int i=1;i<=10000;i++) {
			int k =dFunction(i); //함수 저장값
			if(k<=10000) {//결과값이 10000보다 작을때만
				arr[k]=1;//생성자가 존재하는 인덱스(숫자)에 1넣어주기
			}
		}
		for(int j=1;j<=10000;j++) {
			if(arr[j]!=1) {//1이 아닐때만 출력
				System.out.println(j);
			}
		}
	}

}
