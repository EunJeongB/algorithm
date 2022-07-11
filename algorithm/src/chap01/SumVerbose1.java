package chap01;

import java.util.Scanner;

public class SumVerbose1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n값 : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		// do-while 문법 : do안의 문장을 무조건 실행하고, 
		// 그 뒤에 오는 while 조건식이 true면 do 안의 문장 반복, false면 지나가세요...
		
		int sum = 0;
		
//		for(int i = 1 ; i <= n ; i++) {
//			if(i < n) {
//				System.out.print(i + " + ");
//			}else {
//				System.out.print(i + " = ");
//			} // if
//			sum += i;
//		} // for
		
		for(int i = 1 ; i < n ; i++) {
			System.out.print(i + " + ");
			sum += i;
		} // for
		
		System.out.print(n + " = " + (sum += n));
	} // main
	
} // end class
