package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("전체금액을 입력해 주세요: ");
		int money=s.nextInt();
		System.out.println("실제 지불 금액은 "+money/1000*1000+"입니다." );
		
		s.close();

	}

}
