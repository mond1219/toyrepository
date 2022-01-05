package Datastructure_200;
import java.util.*;
public class B1406 {
	static String str;
	static int index=0;//커서 위치
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		index = str.length();
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			String order = sc.next();
			switch(order){
			case "L":
				left();
				break;
			case "D":
				right();
				break;
			case "B":
				delete();
				break;
			case "P":
				plus(sc.next());
				break;
			}
		}
		System.out.println(str);
	}
	static void left(){
		if(index>0) {	
			index--;
		}
	}
	static void right() {
		if(index<str.length()) {
			index++;
		}
	}
	static void delete() {
		if(index==str.length()) {//커서가 문장 제일 끝에 있을때
			str = str.substring(0,index-1);
			index--;//커서위치 왼쪽으로 당겨주기
		}else if(0<index && index<str.length()) {//커서가 문장 중간에 있을때
			str = str.substring(0,index-1)+str.substring(index);
			index--;
		}//index가 0일때는 그냥 그대로 내비둔다.
	}
	static void plus(String a) {
		if(index==str.length()) {//커서가 문장 제일 끝에 있을때
			str = str+a;
		}else if(0<index && index<str.length()){
			str = str.substring(0,index)+a+str.substring(index);
		}else {//index==0일때
			str = a+str;
		}
		index++;	
	}
}
