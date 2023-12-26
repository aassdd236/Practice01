package com.javaex.practice;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("전체 연필갯수를 입력해 주세요: ");
		int max=s.nextInt();
		System.out.print("전체 인원수를 입력해 주세요: ");
		int n=s.nextInt();
		int a=max/n;
		int b=max%n;
		System.out.println("1인당 연필의 갯수는 "+a+"입니다.");
		System.out.println("연필의 나머지 갯수는 "+b+"입니다.");
		
		s.close();

	}

}
