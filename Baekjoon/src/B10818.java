import java.util.Scanner;

public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];//입력받은 숫자만큼 배열 크기 선언
		
		for(int i=0;i<arr.length;i++) {//배열 크기만큼 입력 받음
			arr[i] = sc.nextInt();
		}
		for(int k=arr.length;k>0;k--) {//버블 정렬
			for(int j=0;j<k-1;j++) {
				if(arr[j]>arr[j+1]) {//뒤에 인수보다 앞에 인수가 크면
					int temp = arr[j];
					arr[j] = arr[j+1];//뒤에 값을 앞에 넣고
					arr[j+1] = temp;//앞의 값을 뒤에 넣어준다.
				}
			}
		}
		System.out.println(arr[0]+" "+arr[arr.length-1]);
	}

}
