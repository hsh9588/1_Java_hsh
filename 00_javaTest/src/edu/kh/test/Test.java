package edu.kh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int input = sc.nextInt(); // 4

		for (int row = 1; row <= input; row++) {
			for (int col = 1; col <= input; col++) {
				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");					
				} else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
}
