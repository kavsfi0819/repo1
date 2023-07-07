package Hybridinher;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a=10;
		for(int i=3; i>=0; i--) {
		try{
		System.out.print(a/i);	
		}
		catch(ArithmeticException e)
		{
			System.out.print(e);
		}
		}
	}

}
