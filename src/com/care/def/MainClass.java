package com.care.def;

import java.util.Scanner;

import com.care.tv_hongjunmo.Tv_hongjunmo;
import com.care.tv_soyoung.TV_soyoung;

public class MainClass {
	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner tv = new Scanner(System.in);
		TV_JCH tvJCH=new TV_JCH();
=======
		
		Scanner input = new Scanner(System.in);
		Tv_hongjunmo tv = new Tv_hongjunmo();
		TV_soyoung tv_soyoung = new TV_soyoung();
		
>>>>>>> c2e1dd09a326733338ae38483ed2db6be8ea7f9c
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
