package com.care.tv_jch;

import java.util.Scanner;

public class TV_jch {

	public static void main(String[] args) {
		System.out.println("����� ���");
		Scanner in=new Scanner(System.in);
		int num;
		System.out.pritnln("1.�ø� 2.����");
		num=in.nextInt();
		if(num==1) tempUp();
		else tempDown();
	}
	private void tempUp() {
		System.out.println("�µ� up");
	}

	private void tempDown() {
		System.out.println("�µ� down");
	}
}
