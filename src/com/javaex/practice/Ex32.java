package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("가로: ");
		double x=s.nextDouble();
		System.out.print("세로: ");
		double y=s.nextDouble();
		double area=x*y/2;
		System.out.println("삼각형의 넓이는 "+area+"입니다");
		
		s.close();
		

	}

}
