package Datastructure_300;
import java.util.*;
public class B1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count =0;
		while(number>=5) {
			count = count+number/5;
			number = number/5;
		}
		System.out.println(count);	
	}
}
