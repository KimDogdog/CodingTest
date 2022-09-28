package codingTest;

import java.util.Scanner;

public class Backjoon1543_Revise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String document = sc.nextLine(); //문서 문자열 입력받기
		String searchString = sc.nextLine(); //찾을 문자열 입력받기 
		
		int documentNum = document.length(); //문서 문자열의 문자열개수
		document = document.replace(searchString,""); //replace함수를 이용해서 찾을 문자열을 공백으로 교체
		System.out.println((documentNum - document.length())/searchString.length());
	
		sc.close();
	}
}
