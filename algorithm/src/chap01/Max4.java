package chap01;

import java.util.Scanner;

public class Max4 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		return max;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = scan.nextInt();
		System.out.print("b의 값 : "); int b = scan.nextInt();
		System.out.print("c의 값 : "); int c = scan.nextInt();
		System.out.print("d의 값 : "); int d = scan.nextInt();
		
		System.out.println("최대값은 " + max4(a,b,c,d) + "입니다.");
		
	} // main
	
} // end class