public class H_CustomExcept {
	    public static void main(String[] args) {
	 
	        try {
	            String welcomeMessage = welcomeMessage("SJ");  //exception invokes when null replaces "SJ"
                          System.out.println("The returned welcome message : " + welcomeMessage);
	        }
	        catch (NullPointerException npex){
	            System.out.println("Exception handled : "+ npex.toString());
	        }
	        finally {
	            System.out.println("Rest of the clean-up code here");
	        }
	    }
	 
	
	    public static String welcomeMessage(String name) 
	            throws NullPointerException {
	 
	        if(name == null) {
	 
	
	            throw new NullPointerException(
	                    "Invoke method with VALID name");
	        }
	 
		        String welcomeMsg = "Welcome " + name;
	 
		        return welcomeMsg;
	    }

}
