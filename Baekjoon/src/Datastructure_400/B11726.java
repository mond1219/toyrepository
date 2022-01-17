package Datastructure_400;

import java.io.BufferedReader;
import java.io.IOException;


public class B11726 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(check(num));
		
	}
	static int check(int num) {
		if(num==1) {
			return 1;
		}else if(num ==2) {
			return 2;
		}
		return check(num-1)+check(num-2);
	}

}
