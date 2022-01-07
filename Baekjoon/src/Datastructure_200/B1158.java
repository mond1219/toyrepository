package Datastructure_200;
import java.io.*;
import java.util.*;
public class B1158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> queR = new LinkedList<>();
		String str = br.readLine();
		String arr[] = str.split(" ");
		for(int i=1;i<=Integer.parseInt(arr[0]);i++) {
			queR.add(i);
		}
		int i=0;
		bw.write("<");
		while(i<Integer.parseInt(arr[0])) {
			for(int j=1;j<Integer.parseInt(arr[1]);j++) {//건너뛸 횟수만큼 반복
				queR.add(queR.poll());//첫번째거 빼고 제일뒤에 넣기
			}
			bw.write(queR.poll()+"");
			if(i<Integer.parseInt(arr[0])-1) {
				bw.write(", ");
			}else {
				bw.write(">");
			}
			i++;
		}
		bw.flush();
		bw.close();
	}
}
