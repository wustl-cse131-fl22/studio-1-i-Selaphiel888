package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		int x = in.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int y = in.nextInt();
		
		System.out.println("The average value of the two integers is: " + ((x+y))/2.0);

		
	}

}
