package codingTest;

import java.util.Scanner;

public class Baekjoon1012 {
	
	public void dfs(int[][] array, int x, int y) {
		try{
			if(array[x+1][y] == 1) {
				array[x+1][y] = 0;
				dfs(array,x+1,y);
			}
		}catch(Exception e){
			
		}
		
		try{
			if(array[x-1][y] == 1) {
				array[x+-1][y] = 0;
				dfs(array,x-1,y);
			}
		}catch(Exception e){
			
		}
		
		try{
			if(array[x][y+1] == 1) {
				array[x][y+1] = 0;
				dfs(array,x,y+1);
			}
		}catch(Exception e){
			
		}
		
		try{
			if(array[x][y-1] == 1) {
				array[x][y-1] = 0;
				dfs(array,x,y-1);
			}
		}catch(Exception e){
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Baekjoon1012 dfs = new Baekjoon1012();
		
		int testCase = sc.nextInt(); //테스트 케이스 수
		
		for(int n =0;n < testCase; n++ ) {
			int x = sc.nextInt(); //배추밭의 가로
			int y = sc.nextInt(); //배추밭의 세로
			int cabbageNum = sc.nextInt(); //배추 수

			int[][] cabbageField = new int[x][y]; //배추밭
			int cabbageX = 0;
			int cabbageY = 0;
			int result = 0;
			
			for(int i = 0; i < cabbageNum;i++) {
				cabbageX = sc.nextInt();
				cabbageY = sc.nextInt();
				cabbageField[cabbageX][cabbageY] = 1;
			}
			
		
			for(int i = 0; i < x;i++) {
				for(int j = 0; j < y;j++) {
					if(cabbageField[i][j] == 1) {
						cabbageField[i][j] = 0;
						dfs.dfs(cabbageField,i,j);
						result++;
					}
					else {
					}
				}
			}
			System.out.println(result);
		}
	}
}
