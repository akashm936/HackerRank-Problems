import java.util.Scanner;

class CheckTypeofInput
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Four Number a ");
		byte a = sc.nextByte();

		if(getType(a)==Byte)
		{
			System.out.println(a +"* Byte");
		}
;	}
}