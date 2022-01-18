package Datastructure_400;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9095 {
	static int[] count = new int [12];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		count[0] = 1;
		count[1] = 1;
		count[2] = 2;
		check();//배열 숫자 셋팅
		int num = Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++) {
			sb.append(count[Integer.parseInt(br.readLine())]+"\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	static void check() {
		for(int i=3;i<=11;i++) {
			count[i] = count[i-1]+count[i-2]+count[i-3];
		}
	}
}
