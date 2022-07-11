package chap01;

import java.util.Scanner;

// 수정 테스트
public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		System.out.println("이등변삼각형을 출력합니다.");
		
		do {
			System.out.print("몇 단 삼각형입니까? : ");
			n = scan.nextInt();
		}while(n <= 0);
		
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
		
	} // main
	
	static void triangleLB(int n) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.println("*".repeat(i));
		} // for
		System.out.println();
	} // triangleLB
	
	static void triangleLU(int n) {
		for(int i = n ; i >= 1 ; i--) {
			System.out.println("*".repeat(i));
		} // for
		System.out.println();
	} // triangleLU

	static void triangleRU(int n) {
		for(int i = n ; i >= 1 ; i--) {
			System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(i));
		} // for
		System.out.println();
	} // triangleRU

	static void triangleRB(int n) {
		for(int i = 1 ; i <= n ; i++) {
			System.out.print(" ".repeat(n-i));
			System.out.println("*".repeat(i));
		} // for
		System.out.println();
	} // triangleRB
	
} // end class
