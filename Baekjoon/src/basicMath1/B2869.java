package basicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B2869 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int dayTime = Integer.parseInt(st.nextToken());//낮에 올라갈 수 있는 길이
		int nightTime = Integer.parseInt(st.nextToken());//밤에 내려가는 길이
		int hight = Integer.parseInt(st.nextToken());//막대높이
		int k=(hight-nightTime)/(dayTime-nightTime);
		if((hight-nightTime)%(dayTime-nightTime)!=0) {
			//나머지가 존재하면 1일 더 추가
			k++;
		}
		System.out.println(k);
	}
}
