import java.util.Scanner;

public class B10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];//입력받은 숫자만큼 배열 크기 선언
		
		for(int i=0;i<arr.length;i++) {//배열 크기만큼 입력 받음
			arr[i] = sc.nextInt();
		}
		
		int min;int max;
		if(arr.length>1) {//배열의 크기가 2이상일때
			//앞에 인덱스 0과 1의 크기를 비교하여 그둘을 일단 min, max로 설정
			if(arr[0]>arr[1]) {
				min=arr[1];max=arr[0];
			}else {
				min=arr[0];
				max=arr[1];
			}
			//뒤에 값들과 비교하여 min보다 작으면 최소값 max보다 크면 최대값으로 다시 설정 
			for(int j=2;j<arr.length;j++) {
				if(arr[j]>max) {
					max=arr[j];
				}else if(arr[j]<min) {
					min=arr[j];
				}
			}
		}else{//배열의 크기가 1일때
			min=arr[0];
			max=arr[0];
		}
		System.out.println(min+" "+max);
	}

}
