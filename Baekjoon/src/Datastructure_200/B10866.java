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
			if(str.equals("pop_front")) {//제일 앞에 있는 정수 pop 없으면 -1 출력
				String st = dq.pollFirst()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else if(str.equals("pop_back")) {//제일 뒤에 있는 정수 pop 없으면 -1 출력
				String st = dq.pollLast()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else if(str.equals("size")){//Deque의 사이즈
				sb.append(dq.size()+"\n");
			}else if(str.equals("empty")) {//Deque가 비어있으면 1 정수가 존재하면 0
				if(dq.isEmpty()) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}else if(str.equals("front")) {//제일 앞 정수 보여주기 
				String st = dq.peekFirst()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else if(str.equals("back")) { // 제일 뒤 정수 보여주기
				String st = dq.peekLast()+"";
				if(st.equals("null")) {
					sb.append("-1\n");
				}else {
					sb.append(st+"\n");
				}
			}else {//push 부분은 숫자를 입력 받는 부분이 있기 때문에 문자열을 나눠주어야 했다.
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
