package com.javaex.practice;

public class Ex17 {
	public static void main(String[] args) {
		int x,y; // 뒤에 ; 빠짐
		x=10; // 뒤에 ; 빠짐
		y=20; // 뒤에 ; 빠짐
		int sum=x+y; // 뒤에 ; 빠짐, sum 타입을 선언하지 않음
		
		System.out.println("합은 "+sum); //둘 다 ""를 사용하여야 함
	}

}
