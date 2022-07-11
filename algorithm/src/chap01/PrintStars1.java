package chap01;

import java.util.Scanner;

public class PrintStars1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n, w;
		
		System.out.println("*를 n개 출력하되, w개마다 줄을 바꿔서 출력합니다.");
		
		do {
			System.out.print("n값 : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		do {
			System.out.print("w값 : ");
			w = stdIn.nextInt();
		}while(w <= 0 || w > n); // w가 0보다 작거나 같을때, w가 n보다 클때는 w값을 다시 받아라.
		
//		====내코드====
		
//		for(int i = 1 ; i <= n ; i++) { 	
//			System.out.print("*");
//			
//			if(i % w == 0) {			
//				System.out.println();
//			} // if
//		} // for
		
		// 예를들어, n이 14, w가 5라고 가정해보자. n / w = 2.xxxx
		for(int i = 0 ; i < n / w; i++) {		// 그럼 2번 반복하게 되겠지...
			System.out.println("*".repeat(w));	// * w개씩 한줄찍어 다음줄로 넘김 
		} // for
		
		int rest = n % w;	// 나머지만큼만 마지막에 * 찍어줌
		if(rest != 0) {		// rest가 0이 아닌경우에만 실행
			System.out.println("*".repeat(rest));
		} // if
		
		
//		====예제코드====
		
//		for(int i = 0 ; i < n ; i++) { 	
//			System.out.print("*");
//			
//			if(i % w == w-1) {			
//				System.out.println();
//			} // if
//		} // for
//		
//		if(n % w != 0) {
//			System.out.println();
//		} // if
		
	} // main
	
} // end class
