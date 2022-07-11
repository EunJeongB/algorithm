package chap01;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("정사각형을 출력합니다.");
		
		do {
			System.out.print("변의 길이 : ");
			num = scan.nextInt();
		}while(num <= 0);
		
		for(int i = 0 ; i < num ; i++) {
			System.out.println("*".repeat(num));
		} // for
		
	} // main
	
} // end class
