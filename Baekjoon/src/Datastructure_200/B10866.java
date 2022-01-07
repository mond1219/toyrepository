package Datastructure_200;
import java.util.*;
import java.io.*;
public class B10866 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int arr[] = new int[count];
		Deque<Integer> dq  = new ArrayDeque();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<count;i++) {
			String str = br.readLine();
			
			if(str.equals("pop_front")) {
				String st = dq.pollFirst()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else if(str.equals("pop_back")) {
				String st = dq.pollLast()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else if(str.equals("size")){
				sb.append(dq.size()+"\n");
			}else if(str.equals("empty")) {
				if(dq.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}else if(str.equals("front")) {
				String st = dq.peekFirst()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else if(str.equals("back")) {
				String st = dq.peekLast()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else {
				String order[] = str.split(" ");
				if(order[0].equals("push_front")) {
					dq.offerFirst(Integer.parseInt(order[1]));
				}else {//push_back
					dq.offerLast(Integer.parseInt(order[1]));
				}
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		
	}
}
