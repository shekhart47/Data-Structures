package r1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ReshapeMatrix {

	static List<ArrayList<Integer>> main_list = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Rows(Original)  :");
		int rows = input.nextInt();
		input.nextLine();

		System.out.println("Enter Columns(Original)  :");
		int columns = input.nextInt();
		input.nextLine();

		int[][] matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {

				System.out.println("Enter Element :" + "[" + i + "][" + j + "] : ");
				matrix[i][j] = input.nextInt();
				input.nextLine();

			}
		}

		
		for(int r = 0; r < rows; r++) {
			for(int c = 0; c< columns ;  c++) {
				System.out.print(matrix[r][c]);
				
				if(c == columns-1) {
					System.out.println();
				}
			}
		}
		
		
		System.out.println("Enter Rows(New)  :");
		int n_rows = input.nextInt();
		input.nextLine();

		System.out.println("Enter Columns(New)  :");
		int n_columns = input.nextInt();
		input.nextLine();

		int [][] x = reshape(matrix, rows, columns, n_rows, n_columns);
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[0].length;j++) {
				System.out.print(x[i][j] + " ");
				
				if(j == x[0].length-1)
				{
					System.out.println();
				}
			}
		}

	}

	public static int[][] reshape(int[][] matrix, int rows, int columns, int n_rows, int n_columns) {

		int[][] new_array = new int[n_rows][n_columns];
		Queue<Integer> queue = new LinkedList<Integer>();
		if (rows * columns == n_rows * n_columns) {

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					queue.add(matrix[i][j]);
				}
			}
			
			for(int k = 0; k < n_rows;k++) {
				for(int l = 0; l < n_columns;l++) {
					new_array[k][l] = queue.remove(); 
				}
			}

			
		}

		return new_array;

	}
}
