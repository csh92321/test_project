package com.care.def;

import java.util.Scanner;
import com.care.tv.Tv_csh;

import com.care.tv_hongjunmo.Tv_hongjunmo;
import com.care.tv_soyoung.TV_soyoung;

public class MainClass {
	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner tv = new Scanner(System.in);
		TV_JCH tvJCH=new TV_JCH();
=======
		
		Scanner input = new Scanner(System.in);
		Tv_csh tv = new Tv_csh();
		Tv_hongjunmo tv = new Tv_hongjunmo();
		TV_soyoung tv_soyoung = new TV_soyoung();
<<<<<<< HEAD
=======
		
>>>>>>> c2e1dd09a326733338ae38483ed2db6be8ea7f9c
>>>>>>> 952ca5fe2b08c2dc2d87a7cb77125769c69f29d0
		int num;
		
		System.out.println("---∞°¿¸¡¶«∞---");
		while(true) {
			System.out.println("1.≥√¿Â∞Ì");
			System.out.println("2.Tv");
			System.out.println("3.ºº≈π±‚");
			System.out.print(">>>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 :
				System.out.println("≥√¿Â∞Ì");
				tv.display();
				break;	
			case 2 :
				System.out.println("Tv");
				tv_soyoung.display();
				break;	
			case 3 :
				System.out.println("ºº≈π±‚");
				break;	
				}
		}
	}

}
