package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		int r=s.nextInt();
		double area=r*r*3.14;
		System.out.println("원의 넓이는 "+area);

		s.close();

	}

}
