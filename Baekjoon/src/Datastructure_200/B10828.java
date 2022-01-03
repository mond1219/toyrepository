package Datastructure_200;
import java.util.*;
public class B10828 {
	static Scanner sc = new Scanner(System.in);
	static int arr[];
	static int size=0;
	public static void main(String[] args) {
		int count = sc.nextInt();
		arr = new int[count];
		for(int i=0;i<count;i++) {
			String str = sc.next();
			if(str.equals("push")) {
				push();
			}else if(str.equals("pop")) {
				pop();
			}else if(str.equals("size")) {
				size();
			}else if(str.equals("empty")) {
				empty();
			}else if(str.equals("top")) {
				top();
			}
		}
	}
	static void push() {
		int num = sc.nextInt();
		arr[size]=num;
		size++;
	}
	static void pop() {
		if(size==0) {
			System.out.println("-1");
		}else {
			System.out.println(arr[size-1]);
			arr[size-1]=0;
			size--;
		}
	}
	static void size(){
		System.out.println(size);
	}
	static void empty() {
		if(size==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	static void top() {
		if(size==0) {
			System.out.println("-1");
		}else {
			System.out.println(arr[size-1]);
		}
	}
}
