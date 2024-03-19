package Practcquestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberProbles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,6,4};
		int[] att2= {2,5,3};
		mergeTwoSortedList(arr,att2);
		
	
	}
	
	static int removeDuplicatesinArr(int[] arr, int n) {
		if(n==0||n==1) {
			return n;
		}
		int [] tmp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				tmp[j++]=arr[i];
			}
		}
		tmp[j++]=arr[n-1];
			for(int i=0;i<j;i++) {
				arr[i]=tmp[i];
				
			}
			return j;
	}
	
static void mergeTwoSortedList(int[] l1,int[] l2) {
int n=l1.length;
int n2=l2.length;

int[] l3=new int[n+n2];
int i=0;
int k=0;
int j=0;
while(i<n) {
	l3[k++]= l1[i++];
			}
while(j<n2) {
	l3[k++]=l2[j++];
	
}
Arrays.sort(l3);
for(int m=0;m<n+n2;m++) {
	System.out.print(l3[m]+" ");
	}
}

}
