package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matriz {
	
	Scanner sc = new Scanner(System.in);
	private int row,column;
	private List<Integer> x = new ArrayList<Integer>();
	private List<Integer> y = new ArrayList<Integer>();
	private int[][] mat;
	
	public Matriz(int row, int column) {
		
		this.row = row;
		this.column = column;
		mat = new int[row][column];
		
	}
	
	public List<Integer> getX() {
		return x;
	}
	
	public List<Integer> getY(){
		return y;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public void registerMatriz() {
		
		System.out.println("Type de number of the matriz:\n ");
		
		for(int i = 0; i < mat.length; i++ ) {
			for(int j = 0 ; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
			}
		}
		
	}
	
	public void printMatriz() {
		System.out.println("\n\nMatriz Typed!");
		
		for(int i = 0; i < mat.length; i++ ) {
			for(int j = 0 ; j < mat[i].length; j++) {
				
				System.out.print(mat[i][j] + " ");;

			}
			System.out.println("");
		}
		
	}
	
	
	public void searchNumber(int number) {
		
		for(int i = 0; i < mat.length; i++ ) {
			for(int j = 0 ; j < mat[i].length; j++) {
				
				if((mat[i][j] == number)) {
					x.add(j);
					y.add(i);
				}
			}
		}
		
	}
	
	public void getNeighbors(int row, int column) {
		
		for(int i = 0; i < x.size(); i++) {
			
			if ((x.get(i) == 0) && (y.get(i) == 0)) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
								
				System.out.println("\nRigth: "+ mat[y][x + 1]);
				System.out.println("\nDown: " + mat[y + 1][x]);
				System.out.println("---------------------");
				
			}else if((y.get(i) == 0) && (x.get(i) != 0) && (x.get(i) < (column - 1))) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
								
				System.out.println("\nRigth: "+ mat[y][x + 1]);
				System.out.println("\nLeft: "+ mat[y][x -1]);
				System.out.println("\nDown: " + mat[y + 1][x]);
				System.out.println("---------------------");
				
			}else if((x.get(i) == (column - 1)) && (y.get(i) == 0)) {
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nLeft: "+ mat[y][x -1]);
				System.out.println("\nDown: " + mat[y + 1][x]);
				System.out.println("---------------------");
				
			}else if((x.get(i) == (column - 1)) && (y.get(i)!=0) && (y.get(i) < (row - 1))) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nUP: " + mat[y - 1][x]);
				System.out.println("\nLeft: "+ mat[y][x -1]);
				System.out.println("\nDown: " + mat[y + 1][x]);
				System.out.println("---------------------");
				
			}else if((x.get(i) == 0) && (y.get(i) != 0) && (y.get(i) < (row - 1))) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nUP: " + mat[y - 1][x]);
				System.out.println("\nRigth: "+ mat[y][x + 1]);
				System.out.println("\nDown: " + mat[y + 1][x]);
				System.out.println("---------------------");
				
			}else if((y.get(i) == (row - 1)) && (x.get(i) == 0)) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nUP: " + mat[y - 1][x]);
				System.out.println("\nRigth: "+ mat[y][x + 1]);
				System.out.println("---------------------");
				
			} else if ((y.get(i) == (row - 1)) && (x.get(i) == (column - 1))) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nUP: " + mat[y - 1][x]);
				System.out.println("\nLeft: "+ mat[y][x -1]);
				System.out.println("---------------------");
				
			} else if((y.get(i) == (row - 1)) && (x.get(i) != 0) && (x.get(i) < (column - 1))) {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nUP: " + mat[y - 1][x]);
				System.out.println("\nRigth: "+ mat[y][x + 1]);
				System.out.println("\nLeft: "+ mat[y][x -1]);
				System.out.println("---------------------");
				
			} else {
				
				int x = this.x.get(i);
				int y = this.y.get(i);
				
				System.out.println("\nUP: " + mat[y - 1][x]);
				System.out.println("\nRigth: "+ mat[y][x + 1]);
				System.out.println("\nLeft: "+ mat[y][x -1]);
				System.out.println("\nDown: " + mat[y + 1][x]);
				System.out.println("---------------------");
				
			}
			
			
		}
		
	}
	
	

}
