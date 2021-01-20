package edunova;

public class TablicaMnozenja {
	public static void main(String[] args) {
		
		for(int i=1; i<16; i++) {
			for(int j=1; j<16; j++) {
				System.out.printf("%4d",(i*j));
			}
			
			System.out.println();
			
		}		
	}

}
