package ch7_lab;

import java.util.Scanner;

public class lab7_2 {
	public static void main(String[] args) {
		System.out.print("Enter a 4-by-4 matrix row by row: \n");
		Scanner input =new Scanner (System.in);
		int m[][]=new int [4][4];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				m[i][j]=input.nextInt();
			}
		}
		int sum=sumMajorDiagonal(m);
		System.out.print("Sum of the elements in the major diagonal is "+sum);

	}
	public static int sumMajorDiagonal(int[][] m){
		int sum=0;
		for(int i=0;i<m.length;i++){
			sum+=m[i][i];
		}
		return sum;
	}

}
