import java.util.*;
public class B5622 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		char wordArr[] = word.toCharArray();
		int sum = 0;
		
		for(int i=0;i<wordArr.length;i++) {
			int ascword = wordArr[i];
			int j=3;
			int k=3;
			while(true) {
				if(j==18 || j==25) {
					j++;
				}
				if(ascword%65<j) {//3,6,9,12,15,
					sum = sum+k;
					break;
				}
				j=j+3;
				k=k+1;	
			}
		}
		System.out.println(sum);
	}
}
