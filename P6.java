package numberpatterns;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int num=i;
			for(int j=1;j<=i;j++) {
				
				System.out.print(num+" ");
				num=num+n-j;
			}System.out.println();
		}
		
		
		
		sc.close();

	}
}
