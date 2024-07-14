import java.util.Scanner;

class CountStringChar
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Two String : ");
		String A = sc.next();
		String B = sc.next();
//		String C = A.substring(0, 1).toUpperCase() + A.substring(1);
//		String D = B.substring(0, 1).toUpperCase() + B.substring(1);
        
        int Alength = A.length();
        int Blength = B.length();
        
        int sum = Alength + Blength;
        System.out.println(sum);
        int i = A.compareTo(B);
        if(i>0)
        {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
//        System.out.println(A + " " + B);
//        System.out.println(A);
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+ B.substring(0, 1).toUpperCase() + B.substring(1));
//        System.out.println();
//	
	 
	 
	}

}
