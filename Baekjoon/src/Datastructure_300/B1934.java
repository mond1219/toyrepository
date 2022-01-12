package Datastructure_300;
import java.io.*;
public class B1934 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		
		for(int i= 0;i<count;i++) {
			String str = br.readLine();
			String[] strArr = str.split(" ");
			int a = Integer.parseInt(strArr[0]);
			int b = Integer.parseInt(strArr[1]);
			sb.append(a*b/gcd(a,b)+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
	static int gcd(int a,int b) {
		if(a<b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while(b!=0) {
			int c = a%b;//나머지
			a = b;
			b = c;
		}
		return a;
	}
}
