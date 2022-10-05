package codingTest;

import java.util.Scanner;

public class Baekjoon14888 {

	public static int max = -1000000000;//최댓값
	public static int min = 1000000000;//최솟값
	
	public static void recursion(int[] a,int[] b,int result,int i,int operatorNum) {// b= 연산자 집합 a=수의 집합 result=는 결과 값 

		operatorNum--;
		//재귀가 되면서 총 연산자수 감소 
		
		if(operatorNum == 0) {
			max = Math.max(result, max);
			min = Math.min(result, min);
		}
		//최종 최댓값, 최솟값 찾기 
		
		if(b[0] != 0) {
			b[0]--;
			//사용한 연산의 수를 감소시켜준다.
			recursion(a,b,result+a[i],i+1,operatorNum);
			b[0]++;
			//함수 호출후 감소했던 연산자의 수를 증가시켜준다.
			//증가 시켜주지 않았을 경우 아래의 연산시 감소처리가 되지 않는다.
		}
		//더하기 연산

		if(b[1] != 0) {
			b[1]--;
			recursion(a,b,result-a[i],i+1,operatorNum);
			b[1]++;
		}
		//빼기 연산
		
		if(b[2] != 0) {
			b[2]--;
			recursion(a,b,result*a[i],i+1,operatorNum);
			b[2]++;
		}
		//곱하기 연산
		
		if(b[3] != 0) {
			b[3]--;
			recursion(a,b,result/a[i],i+1,operatorNum);
			b[3]++;
		}
		//나누기 연산
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//수의 갯수
		
		int[] numArray = new int[num];//입력받을 수열
		int[] operator = new int[4];//연산자 수 배열
		int operatorNum = 0;//연산자 총 개수   
		
		for(int i =0;i<num;i++) {//수열 배열에 넣기
			numArray[i] = sc.nextInt();	
		}
		
		for(int i =0;i<4;i++) {//연산자 수 넣기
			operator[i] = sc.nextInt();	
			operatorNum += operator[i];
		}

		
		recursion(numArray,operator,numArray[0],1,operatorNum+1);		
		
		System.out.println(max);
		System.out.println(min);
		sc.close();
	}
}
