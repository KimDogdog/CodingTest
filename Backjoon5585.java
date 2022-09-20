package codingTest;

import java.util.Scanner;

public class Backjoon5585{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int payment; //입력받은 값 = 지불한 돈
		int changes; //거스름돈
		int outputNum = 0; //출력될 값
		
		payment = sc.nextInt(); // 지불한 돈 입력 받기
		changes = 1000 - payment;
		
		while(true) {
			if(500 <= changes) {
				changes-=500;
				outputNum++;	
			}
			else if(100 <= changes &&  changes <500) {
				changes-=100;
				outputNum++;
			}
			else if(100 <= changes &&  changes <500) {
				changes-=100;
				outputNum++;
			}
			else if(50 <= changes &&  changes <100) {
				changes-=50;
				outputNum++;
			}
			else if(10 <= changes &&  changes <50) {
				changes-=10;
				outputNum++;
			}
			else if(5 <= changes &&  changes <10) {
				changes-=5;
				outputNum++;
			}
			else if(1 <= changes &&  changes <5) {
				changes-=1;
				outputNum++;
			}
			else {
				break;
			}
		}
		
		System.out.print(outputNum);
		
		sc.close();
	}
}