package com.javalab;
import java.util.Scanner;

/*
 * 콘솔 메뉴 switch문 사용
 */

public class RunMain2 {
	
	public static void main(String[] args) {
		// 키보드에서 입력을 받아들이는 객체 생성
		Scanner in = new Scanner(System.in);
		int option = 0;
		int number1, number2; // 키보드에서 받아들일 두 숫자 저장용 변수
		
		while (true) {
			System.out.println("Enter your choice 1.덧셈    2.뺄셈     3.나눗셈    4.곱셈");
			option = Integer.parseInt(in.next()); //입력 문자 읽기
			
			
			if (option == 1) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double sum = number1+number2;
				System.out.println("덧셈 결과 : " +sum);
			}else if (option == 2) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double Ba = number1-number2;
				System.out.println("뺄셈 결과 : " +Ba);
			}else if (option == 3) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double Na = number1/number2;
				System.out.println("나눗셈 결과 : " +Na);
			}else if (option == 4) {
				askForNumbers();
				number1 = Integer.parseInt(in.next());
				number2 = Integer.parseInt(in.next());
				double Go = number1*number2;
				System.out.println("곱셈 결과 : " +Go);
			}else {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			}
			
		}
	}

	private static void askForNumbers() {
		
		
	}

}
