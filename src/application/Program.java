package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> sv = new PrintService<>();
		
		
		
		System.out.print("How many values? : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int value = sc.nextInt();
			sv.addValue(value);
		}
		
		sv.print();
		System.out.println("\nfirst: " + sv.first());
		
		sc.close();
	}

}
