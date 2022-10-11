package codingTest;

import java.util.Scanner;

public class Baekjoon1789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long max = sc.nextLong();//자연수의 합을 입력 받는다.
		long result =0;//최종 결과값 변수
		
		for(int i = 1;i<=max;i++) {// 1부터 자연수의 합에 뺄셈을 한다. 
			max -=i;
			result++;
		}
		System.out.println(result);
		sc.close();
	}
}
