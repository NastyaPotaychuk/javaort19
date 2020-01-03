 import java.util.Scanner;
public class HomeWork5 {
	public static final int COF = 5; 
    public static final int COC = 3; 
    public static final int PEP = 10; 
    public static final int SOD = 10; 
	public static void main(String[] args) {
		int myScore = 28;
		if (myScore ==28) {
			System.out.println("Perfect!!!! You are so seart!!! Well done!!!");
	     } else if (myScore >= 18) {
	       System.out.println("It's an exlecellen result.");
	     } else if (myScore > 30) {
	  	  System.out.println("It's nise resulf.");
	     } else if (myScore > 27) {
	   	  System.out.println("So so.");
	     } else {
	   	System.out.println("It's bad. You need to sdudy more.");  
	     }
		
		
//		 + - / *
		
		Scanner scaner = new Scanner (System.in);
				String userInput;
		
			  System.out.println("Input first number >");
			    userInput = scaner.nextLine();
			    double firstNumber = Double.parseDouble(userInput);
	    
			    System.out.println("Input second number >");
			   userInput = scaner.nextLine();
			    double secondNumber = Double.parseDouble(userInput);
			    System.out.println("Input operation type");
			 System.out.println("For + input 5");
			  System.out.println("For - input 3");
			  System.out.println("For * input 10");
		        System.out.println("For / input 10");
			 userInput = scaner.nextLine();
			int operationType = Integer.parseInt(userInput);
	    
			   String messageForUser;
			   double result;
			   if (operationType == COF) {
			  	result = firstNumber + secondNumber;
			  	messageForUser = "Result of operation (+) is";
			 	} else if (operationType == COC) {
	         		result = firstNumber - secondNumber;
			     	messageForUser = "Result of operation (-) is";
			 	} else if (operationType == PEP) {
			 		result = firstNumber * secondNumber;
			     	messageForUser = "Result of operation (*) is";
				} else {
			    		if (secondNumber == 0) {
			   		result = 0;
			   		messageForUser = "Error, you can not divide by zero";
			  		} else {
			 		result = firstNumber / secondNumber;
			    	messageForUser = "Result of operation (/) is";
	    	 		}
		     	} 	
		    	        System.out.println(messageForUser + result);
}

}
