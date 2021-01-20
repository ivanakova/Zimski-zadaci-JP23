package edunova;

import java.util.Scanner;

public class ZbrajanjeMatrica {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] prva= new int[4][4];
		int[][] druga= new int[4][4];
		
		System.out.println("Prva: ");
		for(int i=0;i<prva.length; i++) {
			for(int j=0; j<prva.length; j++) {
				System.out.println("Unesi broj: ");
				  prva[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Druga: ");
		for(int i=0;i<druga.length; i++) {
			for(int j=0; j<druga.length; j++) {
				System.out.println("Unesi broj: ");
				druga[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		System.out.println("Prva: ");		
		for(int i=0;i<prva.length; i++) {
			for(int j=0; j<prva.length; j++) {
				System.out.print(prva[i][j] + " ");
			}
			System.out.println();
		}		
		
		System.out.println("Druga: ");		
		for(int i=0;i<druga.length; i++) {
			for(int j=0; j<druga.length; j++) {
				System.out.print(druga[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Zbroj: ");
		for(int i=0;i<druga.length; i++) {
			for(int j=0; j<druga.length; j++) {
				System.out.print(prva[i][j]+druga[i][j] + " ");
			}
			System.out.println();
		}
	}

}
