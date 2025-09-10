package arraysPack;

import java.util.Arrays;

public class ejercicioArray {
	public static void main(String[] args) {
		// Declarw two matrix with the same row and colum count and sum them
		
		double matrix1 [][] = new double[3][3]; 
		double matrix2 [][] = new double[3][3]; 
		
		for(int r = 0; r < matrix1.length; r++) {
			for(int c = 0; c < matrix1[r].length; c++) {
				matrix1[r][c] = 1 + (r*c);// + (r+c);
				matrix2[r][c] = 1 + (r+c);// + (r*c);
			}
		}
		
		matrixSum(matrix1, matrix2);
	}
	
	static double[][] matrixSum(double[][] m1, double[][] m2){
		double m3 [][] = new double[3][3];
		for(int r = 0; r < m3.length; r++) {
			for(int c = 0; c < m3.length; c++) {
				m3[r][c] = m1[r][c] + m2[r][c];
			}
		}
		
		for(int i = 0; i < m3.length; i++) {
			System.out.println(Arrays.toString(m3[i]));
		}
		return null;
	}
}
