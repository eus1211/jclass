package j0114;

import java.util.Scanner;

public class Ja0114_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//조건문 - if,switch
		// 1--입력창 2-검색창 3-수정창 4-삭제창 5-종료
		
		System.out.println("사용자권한을 생성합니다.");
		int num = scan.nextInt();
		switch(num) {
		case 5:
			System.out.println("슈퍼바이저 권한이 부여됩니다.");
		case 4:
			System.out.println("삭제 권한이 부여됩니다.");
		case 3:
			System.out.println("수정 권한이 부여됩니다.");
		case 2:
			System.out.println("작성 권한이 부여됩니다.");
		case 1:
			System.out.println("읽을 권한이 부여됩니다.");
			break;
		}
		// if 점수를 입력받아, A-90,B-80,C-70,D-60,F-60점미만 학점을 출력하시오.
		
//		System.out.println("학점을 입력하세요.");
//		int score =scan.nextInt();
//		if(score>=90) {
//			System.out.println("A학점");;
//		}else if(score>=80) {
//			System.out.println("B학점");
//		}else if(score>=70) {
//			System.out.println("C학점");
//		}else if(score>=60) {
//			System.out.println("D학점");
//		}else {
//			System.out.println("F학점");
//		System.out.println("숫자를 입력하세요.");
//		int num =scan.nextInt();
//		if(num>0) {
//			System.out.println("양수입니다.");;
//		}else if(num==0) {
//			System.out.println("0입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
	}}