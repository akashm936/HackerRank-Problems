import java.util.Scanner;

class MultifyNum
{
	public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);

	 System.out.println("Enter a number : ");
	 int num = sc.nextInt();
     int result = num;
	 for(int i=1;i<=10;i++)
	 {
	 	result = num*i;
	 	System.out.println( num + " x " + i + " = "+ result);
	 }

	}
}