package edunova;

import java.util.Scanner;
public class ProstiBrojevi {
	public static void main(String[] args) {		
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Prvi broj:");
		int a = scan.nextInt();
		System.out.println("Drugi broj:");
		int b = scan.nextInt();
		System.out.println("Prime numbers between "+a+" and "+b+" are ");
		scan.close();	
		
		int p=0;
		
		if(a>b) {
			p=a;
			a=b;
			b=p;
		}	
		

		for(int i=a; i<=b; i++) {
			int count=0;
			for(int j=1;j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}			
			if(count==2) {
				System.out.println(i+"   ");
			}			
		}
	}

}
