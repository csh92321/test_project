package com.care.tv_jch;

import java.util.Scanner;

public class TV_jch {

	public static void main(String[] args) {
		System.out.println("냉장고 기능");
		Scanner in=new Scanner(System.in);
		int num;
		System.out.pritnln("1.올림 2.내림");
		num=in.nextInt();
		if(num==1) tempUp();
		else tempDown();
	}
	private void tempUp() {
		System.out.println("온도 up");
	}

	private void tempDown() {
		System.out.println("온도 down");
	}
}
