package test2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Question2 {
	
	public static String getOrder(String a[], int n, int k) {
		char standardDict[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String order = "";
		ArrayList<Character> c = new ArrayList<Character>();
		for(int i=0;i<k;i++) {
			//order+=standardDict[i];
			c.add(standardDict[i]);
		}// Math.random()*(max-min+1)+min
		char ne[] = new char[k];
		for(int i = 0; i<k; i++) {
			Array.setChar(ne, i, c.get((int)(Math.random()*(k))));
		}
		for(int i=0;i<ne.length;i++) {
			order+=ne[i];
		}
		return order;
		
	}
	
	public static int checkOrder(String arr[], int n, int k, String or) {
		String first = "", sec = "";
		first = first + arr[0];
		sec = sec + arr[1];
		int firstIndex =0, lastIndex = 0;
		for(int i=0;i<or.length();i++) {
			if(first.charAt(0)== or.charAt(i)) {
				firstIndex = i;
			}if(sec.charAt(0) == or.charAt(i)) {
				lastIndex = i;
			}
		}
		if(firstIndex<lastIndex)
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"baa", "abcd", "abca", "cab", "cad"};
		int n=5;
		int k=4;
		String order = getOrder(arr, n, k);
		System.out.println(order);
		System.out.println(checkOrder(arr, n, k, order));

	}

}
