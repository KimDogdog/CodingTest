package codingTest;

import java.util.Scanner;

public class Backjoon1543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String insertString = sc.nextLine(); //입력 받은 문자열
		String searchString = sc.nextLine(); //찾을 문자열
		String str = insertString; //중간에 잘린 문자열 값을 저장할 임시 문자열
		int numOfExpose = 0; //최종 출력값 
		
		while(insertString.length() >= searchString.length()) { //문서값의 길이가 찾는 값보다 작아지면 루프에서 빠져나감
			int point = insertString.indexOf(searchString); // 같은 문자열의 위치
			if(-1 == point) { //만약 같은 문자열이 없을 경우 루프에서 나와서 0을 반환
				break; //값은 값이 없다면 루프에서 빠져나감
			}
			str = insertString.substring(point+searchString.length()); //잘린 문자열 임시 저장
			insertString = str; //다시 값을 돌려줌
			numOfExpose++; //같은 문자열 수 추가
		}
		System.out.println(numOfExpose); //최종값 출력
		sc.close();
	}		
}	
