package range;
import java.util.*;
public class B2108 {
		private static int count[] = new int[8001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		double sum=0;//산술평균용 합계
		for(int i=0;i<arr.length;i++) {
			int number =sc.nextInt();
			arr[i]=number;
			count[number+4000]++;
			sum=sum+arr[i];
		}
		Arrays.sort(arr);
		//산술평균
		System.out.println((int)Math.round(sum/(double)num));
		//중앙값
		System.out.println(arr[num/2]);
		//최빈값
		//자주 있는 숫자 개수가 같으면 두번째로 작은 값 출력
		System.out.println(mode());
		//범위
		System.out.println(arr[num-1]-arr[0]);
	}
	static int mode() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(count[0]);//초기값 설정 일단 count배열의 -4000의 개수를 넣어줌 
		for(int i=1;i<count.length;i++) {
			if(count[i]>al.get(0)) {
				al.clear();//기존에 저장되어 있는거 다 지워주기
				al.add(count[i]);//list 0번째의 개수 넣어주기 
				//개수를 max변수에 넣어주고 
				//인덱스 저장
				al.add(i);//1번째에 index 숫자 값을 넣어준다. 
			}else if(count[i]==al.get(0)){
				al.add(count[i]);
				al.add(i);
			}
		}
		//index2=-1이라면 최빈값이 하나이므로
		if(al.size()==2) {
			return al.get(1)-4000;
		}else {//최빈값같은거 2이상
			int min1=0;
			int min2=0;
			if(al.get(1)>al.get(3)) {
				min1=al.get(3);
				min2=al.get(1);
			}else {
				min1=al.get(1);
				min2=al.get(3);
			}
			
			for(int i=5;i<al.size();i=i+2) {
				if(min1>al.get(i)) {
					min2=min1;
					min1=al.get(i);
				}
			}
			//min2는 두번째로 작은 최빈값
			return min2-4000;
		}
		
		
		
	}

}
