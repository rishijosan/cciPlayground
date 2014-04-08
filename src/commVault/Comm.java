package commVault;

import java.util.Scanner;

public class Comm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing Lines");
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}

	}

}
