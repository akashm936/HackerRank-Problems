import java.util.Scanner;

class HackerRank1
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n = sc.nextInt();

        // checking();
      /// ---------------logic 1 --------------------
		if(n%2==0)
		{
			if(n>=2 || n<5 && n>=6 || n<20)
			{
				System.out.println(n + " is Not weird");
			}
			
		}
		else{
			System.out.println(n + " is weird ");
		}


	////-------------------logic 2--------------------
    // }
    // public static String checking(){
    // 	 if(n%2==0)
    //  {
    //  	if((n>=2&&n<=5)||(n>20)){
    //  		return " Not Weird";
    //  	}
    //  }
    //  return " Weird ";
    // }
    
}