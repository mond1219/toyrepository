package Datastructure_300;
import java.io.*;
public class B6588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				break;
			}
			int a=3;
			while(a<num) {
				if(find(a,num)) {
					sb.append(num+" = "+a+" + "+(num-a)+"\n");
					break;
				}
				a++;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	static boolean find(int a,int num) {//a도 소수이고 num-a도 소수일때 
		if(check(a)&&check(num-a)) {
			return true;
		}
		return false;
	}
	static boolean check(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i ==0||num%2==0) {
				return false;
			}
		}
		return true;
	}
}
