import java.util.Scanner;

class HackerRank6b
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			try{

				long n = sc.nextLong();
				System.out.println(n+ " can be fitted in:");

				if(n>=-128 && n <=127)
				{
					System.out.println("* byte");
				}
				if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE)
				{
					System.out.println("* short");
				}
				if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE)
				{
					System.out.println("* int");
				}
				if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE)
				{
					System.out.println("* long");
				}
			}
			catch(Exception e)
			{
				System.out.println(sc.next() + "can't be fitted anywhere ");
			}

		}
	}
}