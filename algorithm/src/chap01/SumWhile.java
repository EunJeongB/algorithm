package chap01;

import java.util.Scanner;


public class SumWhile {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n값 : ");
		
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println(String.format("1부터 %d까지의 합은 %d입니다.", n, sum));
		System.out.println("i의 값은 " + i + "(으)로 종료됩니다.");
		
	} // main
	
} // end class
