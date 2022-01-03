package range;
import java.util.*;
public class B1181 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String arr[] = new String[count];
		
		for(int i=0;i<count;i++) {
			arr[i] = sc.next();
		}
		Arrays.sort(arr, new Comparator<String>() {		
			@Override
			public int compare(String a1, String a2) {
				if(a1.length() == a2.length()) {
					return a1.compareTo(a2);
				}else {
					return a1.length()-a2.length();
				}
			}
		});
		System.out.println(arr[0]);
		for(int i=1;i<count;i++) {
			if(!arr[i].equals(arr[i-1])) {//중복된 문자열은 한번반 출력해야하기 때문에
				System.out.println(arr[i]);
			}
		}
	}

}
