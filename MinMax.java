package edunova;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] brojevi = new int[24];
		
		for(int i = 0; i < brojevi.length; i++) {
			  System.out.println("Unesi broj: ");
			  brojevi[i] = scan.nextInt();
			}
		scan.close();
		
		int zbroj = 0;
		for(int i = 0; i < brojevi.length; i++) {			
			zbroj+=brojevi[i];			  
		}
		
		System.out.println("Zbroj: " +zbroj);
		
		int max= brojevi[0];
		for(int i = 0; i < brojevi.length; i++) {			
			if (brojevi[i] > max) {
				max=brojevi[i];				
			}			  
		}
		
		System.out.println("Max: " +max);
		
		int min =brojevi[0];
		for(int i = 0; i < brojevi.length; i++) {			
			if (brojevi[i] < min) {
				min=brojevi[i];				
			}			  
		}
		
		System.out.println("Min: " +min);		
			
	}

}
