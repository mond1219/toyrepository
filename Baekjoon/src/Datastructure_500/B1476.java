package Datastructure_500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = str.split(" ");
		int arrNum[] = new int[3];
		for(int i=0;i<arr.length;i++) {
			arrNum[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(check(arrNum[0],arrNum[1],arrNum[2]));
	}
	static int check(int e,int s, int m) {
		if(e == s && e == m) {
			return e;
		}else {
			while(true) {
				e = 15+e;
				if(sunCheck(e,s)&&moonCheck(e,m)) {
					return e;
				}
			}
		}
	}
	static boolean sunCheck(int e, int s) {
		int i=0;
		
		while(e-28*i>0) {
			if(s == (e-28*i)) {
				return true;
			}
			i++;
		}
		
		return false;
	}
	static boolean moonCheck(int e,int m) {
		int i=0;
		while(e-19*i>0) {
			if(m == (e-19*i)) {
				return true;
			}
			i++;
		}
		return false;
	}
}
