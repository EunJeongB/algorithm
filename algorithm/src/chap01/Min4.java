package chap01;

import java.util.Scanner;

public class Min4 {

	static int min4(int a, int b, int c, int d) {
		int max = a; System.out.println("a 대입");
		if(b < max) {
			max = b;
			System.out.println("b 대입");
		}
		if(c < max) {
			max = c;
			System.out.println("c 대입");
		}
		if(d < max) {
			max = d;
			System.out.println("d 대입");
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("네 정수의 최솟값을 구합니다.");
		System.out.print("a의 값 : "); int a = scan.nextInt();
		System.out.print("b의 값 : "); int b = scan.nextInt();
		System.out.print("c의 값 : "); int c = scan.nextInt();
		System.out.print("d의 값 : "); int d = scan.nextInt();
		
		System.out.println("최솟값은 " + min4(a,b,c,d) + "입니다.");
		
	} // main
	
} // end class