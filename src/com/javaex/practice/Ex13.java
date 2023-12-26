package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		System.out.println(13/5); //둘 다 정수형이므로 결과값도 정수형인 2가 나옴
		System.out.println((double)13/5); //2.6
		System.out.println(13/(double)5); //2.6
		System.out.println((double)13/(double)5); //2.6
		System.out.println(13.0/5); //2.6
		System.out.println(13/5.0); //2.6
		System.out.println((double)(13/5)); //결과값이 정수로 나온 상태에서 double로 변환, 2.0 출력

	}

}
