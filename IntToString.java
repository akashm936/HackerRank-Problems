import java.util.Scanner;

class IntToString
{
	public static void main(String[] args) {
		
				Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
	    
	    if(n>-100 && n<=100)
	    {
	       String s = Integer.toString(n);
	       System.out.println("Good job");
	    }
	    else {
	    	System.out.println("Wrong answer");
	    }
	}

}