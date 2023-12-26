package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("반지름: ");
		int r=s.nextInt();
		double v=r*r*r*3.14*4/3;
		System.out.println("구의 부피는: "+v+"입니다.");
		s.close();

	}

}
