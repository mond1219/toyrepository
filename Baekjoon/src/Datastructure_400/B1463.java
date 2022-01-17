package Datastructure_400;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B1463 {
	
	static Integer[] count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		count = new Integer[num+1];
		count[0] = count[1] = 0;
		
		System.out.println(find(num));
	}
	static int find(int num) {
		if(count[num] == null) {
			if(num%6 == 0) {
				//3과 2 둘다 동시에 나눠질 경우
				count[num] = Math.min(find(num-1), Math.min(find(num/3),find(num/2)))+1;
			}else if(num%3 == 0) {
				//3으로 나눠질 경우
				count[num] = Math.min(find(num-1), find(num/3))+1;
			}else if(num%2 == 0) {
				//2로 나눠질 경우
				count[num] = Math.min(find(num-1), find(num/2))+1;
			}else {
				//2,3둘다 안나눠질때 
				count[num] = find(num-1)+1;
			}
		}
		return count[num];
	}

}
