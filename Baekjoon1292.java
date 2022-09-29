package codingTest;

import java.util.Scanner;

public class Baekjoon1292 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int count = 1;
	
		for(int i = 1; i<= 1000;i++){
			for(int j = 1; j<=i; j++) {
				if(a <=count&&count <=b  ) {
					sum += i; 
					count++;
				}
				else if(b < count) {
					break;
				}
				else {
					count++;					
				}
			}
		}
		
		System.out.println(sum);
		sc.close();
	}
}
