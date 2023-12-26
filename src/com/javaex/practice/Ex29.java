package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");
		double x=s.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double y=s.nextDouble();
		
		double cir=(x+y)*2;
		double area=x*y;
		
		System.out.println("사각형의 넓이는 "+ area);
		System.out.println("사각형의 둘레는 "+ cir);
		
		s.close();
		
	}

}
