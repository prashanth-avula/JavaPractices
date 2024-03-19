package StringPrb;

import java.util.Arrays;

public class PracticePrbls {
	
	

	public static void main(String[] args) {
		int[] arr= {1,4,3};
		int[] arr2= {5,8,7};
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int a1=arr[arr.length-2];
		int a3=arr[arr.length-1];
		System.out.println(a1+a3);
	
	}
}
