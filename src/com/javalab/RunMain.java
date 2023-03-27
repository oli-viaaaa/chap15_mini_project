package com.javalab;
import java.util.Scanner;

/*
 * 콘솔 메뉴 if문 사용
 */

public class RunMain {
	
	public static void main(String[] args) {
		// 키보드에서 입력을 받아들이는 객체
		Scanner in = new Scanner(System.in);
		
		int option;
		
		while (true) {
			System.out.println("번호를 입력하세요. 1.덧셈    2.뺄셈     3.나눗셈     4.곱셈");
			option = Integer.parseInt(in.next()); // int로 변환_문자열이 들어오면 정수로 변환시켜준다.
			
			if (option == 1) {
				System.out.println("1. 덧셈");
			}else if (option == 2) {
				System.out.println("2. 뺄셈");
			}else if (option == 3) {
				System.out.println("3. 나눗셈");
			}else if (option == 4) {
				System.out.println("4. 곱셈");
			}else { // 1,2,3,4 외의 숫자가 올 경우
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0); // 0-정상적으로 종료
				break;
			}
			
		} // while end
		in.close();
	} //main end
	
	private static void askForNumbers() {
		System.out.println("두 개의 숫자를 입력하세요.");
		System.out.println();
	}

}//class end
