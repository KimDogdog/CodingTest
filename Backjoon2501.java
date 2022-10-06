package codingTest;

import java.util.Scanner;

public class Backjoon2501 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();//N입력 
			int K = sc.nextInt();//K입력
			int num = 0;//약수의 크기순을 나타내는 함수
			
			for(int result=1; result <=N; result++) {//N을 1부터 K까지 나눗셈
				
				int share =  N%result;//몫을 구함
				if(share == 0) {//몫이 0일 경우 약수임으로 약수의 크기순을 증가 시킨다. 
					num++;
					if(num == K) {//만약 순번이 k번째 라면 결과를 출력하고 프로그램 종료
						System.out.println(result);
						System.exit(0);
					}
				}
			}
			if(num<K) {//만약 N의 약수가 K보다 작다면 0을 출력
				System.out.println(0);
			}
			
			sc.close();
		}
}
