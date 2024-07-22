import java.util.Scanner;

class HackerRank7
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner("Hello world!");

		System.out.println("Enter a String");

		System.out.println("Delimiter:" + sc.delimiter());

		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}

	}
}