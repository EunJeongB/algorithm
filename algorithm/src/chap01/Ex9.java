package chap01;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a값 : ");
		int a = scan.nextInt();
		int b;
		
		while(true) {
			System.out.print("b값 : ");
			b = scan.nextInt();
			
			if(a < b) break;
			
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		System.out.println("b-a는 " + (b-a) + "입니다.");
		
	} // main
	
} // end class
