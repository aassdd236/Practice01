package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");
		int mi=s.nextInt();
		double km=mi*1.609;
		System.out.println(mi+"마일은 "+km+"킬로미터 입니다.");
		
		s.close();

	}

}
