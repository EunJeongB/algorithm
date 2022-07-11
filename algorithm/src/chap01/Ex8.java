package chap01;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("num1 값을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.print("num2 값을 입력하세요 : ");
		int num2 = scan.nextInt();
		
		int sum = sumof(num1, num2);
		System.out.println(String.format("%d와 %d 사이의 합계는 %d 입니다.", num1, num2, sum));
		
	} // main
	
	static int sumof(int a , int b) {
		
		int sum = 0;
		
		if(a > b) {
			
			for(int i = b ; i <= a ; i++) {
				sum += i;
			} // for
				
		}else if(a == b){
			sum = a;
		}else{ // b > a
			
			for(int i = a ; i <= b ; i++) {
				sum += i;
			} // for
			
		} // if
		
		return sum;
	} // sumof
	
} // end class
