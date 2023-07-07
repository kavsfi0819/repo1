package Hybridinher;

public class trycatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 
		        try {
		            // call division() method
		            String welcomeMessage = welcomeMessage("SJ");
		 
		            // print to console
		            System.out.println("The returned welcome message : "
		                    + welcomeMessage);
		        }
		        catch (NullPointerException npex){
		            System.out.println("Exception handled : "
		                    + npex.toString());
		        }
		        finally {
		            System.out.println("Rest of the clean-up code here");
		        }
		    }
		 
		    // division method returning quotient
		    public static String welcomeMessage(String name)
		            throws NullPointerException {
		 
		        if(name == null) {
		 
		            // explicitly throwing Null Pointer Error
		            // using throw keyword
		            throw new NullPointerException(
		                    "Invoke method with VALID name");
		        }
		 
		        // performing String concatenation
		        String welcomeMsg = "Welcome " + name;
		 
		        /// return concatenated string value
		        return welcomeMsg;

		
	}

}
