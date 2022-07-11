package chap01;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n값을 입력하세요 : ");
		
		int n = scan.nextInt();
		int sum = 0;
		
		if(n % 2 == 0) {
			sum = ( 1 + n ) * ( n / 2 );
		}else {
			sum = ( 1 + n ) * ( n / 2 ) + ( 1 + n )/2;
		}
		
		System.out.println("1~" + n + "까지의 합계는 " + sum + "입니다.");
		
	} // main
	
} // end class
