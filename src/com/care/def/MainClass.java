package com.care.def;

import java.util.Scanner;
import com.care.tv.Tv_csh;

import com.care.tv_hongjunmo.Tv_hongjunmo;
import com.care.tv_soyoung.TV_soyoung;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Tv_csh tv = new Tv_csh();
		Tv_hongjunmo tv = new Tv_hongjunmo();
		TV_soyoung tv_soyoung = new TV_soyoung();
		int num;
		
		System.out.println("---������ǰ---");
		while(true) {
			System.out.println("1.�����");
			System.out.println("2.Tv");
			System.out.println("3.��Ź��");
			System.out.print(">>>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 :
				System.out.println("�����");
				tv.display();
				break;	
			case 2 :
				System.out.println("Tv");
				tv_soyoung.display();
				break;	
			case 3 :
				System.out.println("��Ź��");
				break;	
				}
		}
	}

}
