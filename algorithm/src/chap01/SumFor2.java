package chap01;

import java.util.Scanner;


public class SumFor2 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		int n;
		
		do {
			System.out.print("n값(양수를 입력하세요) : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for(int i = 1 ; i <= n ; i++) {
			sum += i;
		}
		
		System.out.println(String.format("1부터 %d까지의 합은 %d입니다.", n, sum));
		
	} // main
	
} // end class
