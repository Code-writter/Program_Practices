

class ExceptionHandling { 
	public static void main (String[] args) { 
	int num1=5; 
	int num2=0;

	    try{ 
	    	System.out.println(num1/num2); 
	    	} 
	    catch(ArithmeticException e){ 
	    	System.out.println(e.getMessage()); 
	    } 
	} 
} 
