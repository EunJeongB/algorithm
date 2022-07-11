package chap01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0; 
		
		while(true) {
			System.out.print("양의 정수를 입력하세요 : ");
			num = scan.nextInt();

			if(num > 0) break;
		} // while
		
		int n = num / 10;		// 10을 나눈 값
		int i = 1;				// 몇의 자리냐
		int j = 1;				// *10용
		
		for(; i < 100 ; i++) {
			if(n < j) {
				System.out.println("그 수는 " + i + "자리입니다.");
				break;
			} // if
			j *= 10;
		} // for
		
	} // main
	
} // end class
