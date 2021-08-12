package com.care.def;

import java.util.Scanner;

import com.care.tv_soyoung.TV_soyoung;

public class MainClass {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		TV_soyoung tv_soyoung = new TV_soyoung();
		//pull 연습해보기
		
		int num;
		
		System.out.println("---가전제품---");
		while(true) {
			System.out.println("1.냉장고");
			System.out.println("2.Tv");
			System.out.println("3.세탁기");
			System.out.print(">>>> : ");
			num = input.nextInt();
			switch(num) {
			case 1 :
				System.out.println("냉장고");
				break;	
			case 2 :
				System.out.println("Tv");
				tv_soyoung.display();
				break;	
			case 3 :
				System.out.println("세탁기");
				break;	
				}
		}
	}

}
