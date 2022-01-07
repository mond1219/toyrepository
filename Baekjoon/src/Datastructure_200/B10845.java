package Datastructure_200;
import java.io.*;
public class B10845 {
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		int first = 0;//첫번째 index
		int last = 0;//queue개수
		int arr[] = new int[count];
		
		for(int i=0;i<count;i++) {
			String order = br.readLine();
			switch(order){
			case "pop":
				if(last != first) {
					sb.append(arr[first]+"\n");
					arr[first]=0;
					first++;
				}else {
					sb.append("-1\n");
				}
				break;
			case "size":
				sb.append((last-first)+"\n");
				break;
			case "empty":
				if(last != first) {
					sb.append("0\n");
				}else {//존재할때
					sb.append("1\n");
				}
				break;
			case "front":
				if(last != first) {//큐가 비어있지 않으면
					sb.append(arr[first]+"\n");
				}else {
					sb.append("-1\n");
				}
				break;
			case "back":
				if(last != first) {
					sb.append(arr[last-1]+"\n");
				}else {
					sb.append("-1\n");
				}
				break;
			default : //push일때
				String orderArr[] = order.split(" ");
				arr[last]=Integer.parseInt(orderArr[1]);
				last++;
				break;
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
