package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("월급을 입력하세요: ");
		int money= s.nextInt();
		int money10=money*12*10;
		System.out.println("10년동안 최대 저축액은 "+money10+"원 입니다.");
		
		
		s.close();
	

	}

}
