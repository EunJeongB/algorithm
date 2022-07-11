package chap01;


public class Ex11 {

	public static void main(String[] args) {
		
//		System.out.print("  |");
//		
//		for(int i = 1 ; i <= 9 ; i++) {
//			System.out.print(" " + i + " ");
//		} // for
//		
//		System.out.println();
//		
//		for(int i = 1 ; i <= 30 ; i++) {
//			if(i == 3)
//				System.out.print("+");
//			else
//				System.out.print("-");
//		} // for
//		
//		System.out.println();
//		
//		for(int i = 1 ; i <= 9 ; i++) {
//			
//			System.out.print(i + " |");
//			
//			for(int j = 1 ; j <= 9 ; j++) {
//				
//				System.out.print(String.format("%2s ", i*j));
//				
//			} // for
//			
//			System.out.println();
//			
//		} // for
		
		
		
		System.out.print("   |");
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%3d", i);
		} // for
			
		System.out.println("\n---+---------------------------");

		for (int i = 1 ; i <= 9 ; i++) {
			
			System.out.printf("%2d |", i);
			
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%3d", i * j);
			} // inner-for
				
			System.out.println();
		} // outer-for
		
	} // main
	
} // end class
