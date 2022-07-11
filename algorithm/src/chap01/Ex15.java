package chap01;

import java.util.Scanner;
//test

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("피라미드를 출력합니다.");
		
		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = scan.nextInt();
		}while(n <= 0);
		
//		spira(n);
		System.out.println();
		npira(n);
		
	} // main
	
	static void spira(int n) {
		int blank = ((n-1)*2+1) / 2;
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(" ".repeat(blank));
			System.out.print("*".repeat((i-1)*2+1));
			System.out.print(" ".repeat(blank) + "\n");
			blank--;
		} // for
	} // spira
	
	static void npira(int n) {
		int blank = ((n-1)*2+1) / 2;
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(" ".repeat(blank));
			
			for(int j = 1 ; j <= (i-1)*2+1 ; j++) {
				System.out.print(i % 10);
			} // inner-for
			
			System.out.print(" ".repeat(blank) + "\n");
			blank--;
		} // outer-for
	} // npira
	
} // end class
