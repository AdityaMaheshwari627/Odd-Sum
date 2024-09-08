package Arrays;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++) {
        	if((arr[i])%2!=0) {
        		sum+=arr[i];
        	}
        }
        System.out.print("Sum of odd elements are:"+sum);
	}

}
