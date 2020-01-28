import java.util.Locale;
import java.util.Scanner;

import Entities.Matriz;

public class Exercicio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type a amount of Rows of the matriz: ");
		int row = sc.nextInt();
		
		System.out.println("Type a amount of Columns of the matriz: ");
		int column = sc.nextInt();
		
		Matriz matriz = new Matriz(row, column);
		
		matriz.registerMatriz();
		
		matriz.printMatriz();
				
		char question = 's';
		
		while(question == 's') {
			
			System.out.println("What number do you search? ");
			int number = sc.nextInt();
			
			matriz.searchNumber(number);
					
			matriz.getNeighbors(row, column);
			System.out.println("Continue?[s/n]");
			question = sc.next().charAt(0);	
			
		}
					
		
		
		sc.close();

	}

}
