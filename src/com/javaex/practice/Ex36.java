package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("500원의 개수: ");
		int a=s.nextInt();
		System.out.print("100원의 개수: ");
		int b=s.nextInt();
		System.out.print("50원의 개수: ");
		int c=s.nextInt();
		System.out.print("10원의 개수: ");
		int d=s.nextInt();
		int money=a*500+b*100+c*50+d*10;
		System.out.println("동전의 총합은 "+money+"원 입니다.");
		
		s.close();

	}

}
