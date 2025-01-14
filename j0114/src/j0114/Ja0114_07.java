package j0114;

import java.util.Scanner;

public class Ja0114_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//while 구구단 출력하시오.
		int i =2;
		while(i<=9) {
			int j =1;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(i*j)+"");
				j++;
			}
			System.out.println("");
			i++;
		}
		
//		int i =1;
//		while(i<=5) {
//			System.out.println("안녕"+i);
//			i++;
//		}
//		for(int j=1;j<=5;j++) {
//			System.out.println("안녕"+j);
//		}
		
		//입력받은 숫자부터 9단까지 출력 프로그램 구현
//		System.out.println("숫자1를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.");
//		int num2 = scan.nextInt();
//		
//		int max,min;
//		if(num1>num2) {
//			max= num1;
//			min= num2;
//		}else {
//			max= num2;
//			min= num1;
//		}
//		max = Math.max(num1, num2);
//		min = Math.min(num1, num2);
		
		//구구단
//		for(int i=2; i<=9; i++)
//			for(int j=1; j<=9; j++)
//				System.out.println(i+"x"+j+"="+(i*j));
		
		//입력받은 글자를 1개씩 출력하는 프로그램을 구현하시오.
//		System.out.println("글자를 입력하세요.");
//		String input = scan.next();
		// 모두 영문자일때만 1개씩 출력하시오.
		
//		
//		for(int i=0;i<input.length();i++) {
//			if (input.charAt(i)>='a' && input.charAt(i)<='z' || input.charAt(i)>='A' && input.charAt(i)<='Z') {
//				temp = 1;
//				break;
//			}
//				
//		}
//		if(temp == 0) {
//			for(int i=0;i<input.length();i++) {
//				System.out.println(input.charAt(i));
//			}
//		}else {
//			System.out.println("입력한 글자중에 영문자가 아닌것이 있습니다. 다시 입력하세요.");
//		}
		
		//단어를 1개씩 출력
//		String input = "abcdefghijk";
//		for(int i=0;i<input.length();i++) {
//			System.out.println(input.charAt(i));
//		}
//		
//		System.out.println(input.length());
//		System.out.println(input.charAt(input.length()-1));
//		System.out.println("글자를 입력하세요.(영문자만 입력가능) :");
//		String str = scan.next();
//		char ch = str.charAt(0);
//		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' ) {
//			System.out.println("출력 :"+ch);
//		}else {
//			System.out.println("영문자가 아닙니다. 다시 입력하세요,!!");
//		}
//		
		//반복문
//		int sum =0;
//		for(int i=1;i<=10;i++) {
//			//System.out.println(i);
//			sum = sum + i;
//		}
//		System.out.println(sum);
	}

}
