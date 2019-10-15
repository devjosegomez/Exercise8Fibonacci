package com.exercise8fibonacci.app;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		long fibonacci = 1;
		int cont1 = 0;
		int cont2 = 1;
		int bound = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter a number to calculate fibonacci: ");
			bound = input.nextInt();
			if(bound<=0) {
				System.err.println("Must enter a number higher than 0");
			}
		}while(bound <= 0);
		
		for(int i=0; i<bound; i++) {
			System.out.println(fibonacci + " ");
			fibonacci = cont1 + cont2;
			cont2 = (int) fibonacci;
		}
		
	}

}
