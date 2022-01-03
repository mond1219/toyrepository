package Datastructure_200;
import java.util.*;
public class B10828 {
	public static int arr[];
	public static int size=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int count = sc.nextInt();
		arr = new int[count];
		for(int i=0;i<count;i++) {
			String str = sc.next();
			if(str.equals("push")) {
				push(sc.nextInt());
			}else if(str.equals("pop")) {
				sb.append(pop()).append("\n");
			}else if(str.equals("size")) {
				sb.append(size()).append("\n");
			}else if(str.equals("empty")) {
				sb.append(empty()).append("\n");
			}else if(str.equals("top")) {
				sb.append(top()).append("\n");
			}
		}
		System.out.println(sb);
	}
	static void push(int num) {
		arr[size]=num;
		size++;
	}
	static int pop() {
		if(size==0) {
			return -1;
		}else {
			return arr[--size];//감소시킨 후에 그 값을 사용
		}
	}
	static int size(){
		return size;
	}
	static int empty() {
		if(size==0) {
			return 1;
		}else {
			return 0;
		}
	}
	static int top() {
		if(size==0) {
			return -1;
		}else {
			return arr[size-1];
		}
	}
}
