package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("화씨: ");
		double f=s.nextDouble();
		double c=(f-32)*5/9;
		System.out.println("화씨 "+f+"의 섭씨온도는 "+c+"입니다.");
;		
		s.close();

	}

}
