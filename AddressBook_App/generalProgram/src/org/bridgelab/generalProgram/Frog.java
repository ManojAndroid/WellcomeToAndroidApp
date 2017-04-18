package org.bridgelab.generalProgram;

import java.util.Scanner;

public class Frog {
	static void frog(int height, int init, int jum) {
		int count = 0;
		int sum = 0;
		while (sum < height) {
			sum = sum + jum + init;
			sum--;
			count++;

		}
		System.out.println("frog willl jump  " + count + "  time to comout from wall");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println(" Enter the height of wall");
		int height = scanner.nextInt();
		System.out.println("Enter the Frog One time jumping height");
		int frogjump = scanner.nextInt();
		System.out.println("Enter the Frog initial point");
		int init = scanner.nextInt();
		frog(height, init, frogjump);

	}
}
