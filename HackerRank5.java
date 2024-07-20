import java.util.Scanner;

class HackerRank5
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();

			int z =a;
			for(int j=0;j<n;j++)
			{
				z +=(Math.pow(2,j)*b);
				System.out.println(z + " ");
			}
			System.out.println();
		}
        //in.close();
	}
}