package chap01;

import java.util.Scanner;

public class Median {

	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c){	// c >= a >= b
				return a;
			}else { // a > c > b
				return c;
			}
		}else if(a > c){	// b > a > c
			return a;
		}else if(b > c) { // b > c > a
			return c;
		}else { // c > b > a
			return b;
		}
	} // med3
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 중간값을 구합니다.");
		System.out.print("a의 값 : "); int a = scan.nextInt();
		System.out.print("b의 값 : "); int b = scan.nextInt();
		System.out.print("c의 값 : "); int c = scan.nextInt();
		
		System.out.println("중간값은 " + med3(a,b,c) + "입니다.");
		
	}
	
} // end class
