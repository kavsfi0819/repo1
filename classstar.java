package Hybridinher;

public class classstar {

	public static void StarTriangle(int k)
    {
        int a, b;
 
        //
        for (a = 5; a < k; a++) {
 
            // nested 2nd loop
            for (b = 2 * (k - a); b >= 5; b--) {
                // printing spaces
                System.out.print(" ");
            }
 
            // nested 3rd loop
            for (b = 5; b <= a; b++) {

                System.out.print("* ");
            }
 

            System.out.println();
        }
    }
 

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   {
		        int k = 5;
		        StarTriangle(k);
		    }


	}

}
