package com.care.tv_soyoung;

import java.util.Scanner;

public class TV_soyoung {

	public void display() {
		System.out.println("����� �ϴ� �����");
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("1. �ø� 2.����");
		num =scan.nextInt();
		if(num==1) tempUp();
		else tempDown();
	}
	private void tempUp() {
		System.out.println("�µ��� �ø��ϴ�");
	}
	private void tempDown() {
		System.out.println("�µ��� ����ϴ�.");
	}
	
}
