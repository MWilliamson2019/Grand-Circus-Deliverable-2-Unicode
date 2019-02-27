package mypackage;
import java.util.Scanner;

public class MenuChoice {

	public static void main(String[] args) {
		
		int eventType;
		int partySize;
		String result = new String();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an event type: ");
		System.out.println("1: for casual, 2: for semi-formal, 3: for formal");
		eventType = scan.nextInt();
		
		if (eventType != 0) {
			
			System.out.print("Enter the party size: ");
			partySize = scan.nextInt();
		
			if (partySize != 0) {
			
			
		/* Logic for event type casual - the user enters 1.
		 * The nested if and else if statements covers the party sizes. */
		
				if (eventType == 1) {
					if (partySize == 1) {
				
					result = "Since you're hosting a casual event for 1 participant, you should"
					+ " serve sandwiches in the microwave.";
			
					System.out.println(result);
				
					} else if ((partySize == 2) || (partySize <= 12)) {
				
					result = "Since you're hosting a casual event for " + partySize + 
					" participants, you should serve sandwiches in your kitchen.";
			
					System.out.println(result);
				
					} else if (partySize >= 13) {
			
						result = "Since you're hosting a casual event for " + partySize + 
						" participants, you should serve sandwiches by a caterer.";
			
					System.out.println(result);
			
					}
			
				}
		
		/* Logic for event type semi-formal - the user enters 2.
		 * The nested if and else if statements covers the party sizes. */
		
				if (eventType == 2) {
					if (partySize == 1) {
				
						result = "Since you're hosting a semi-formal event for 1 participant, you should"
						+ " serve fried chicken in the microwave.";
						
					System.out.println(result);
					
					} else if ((partySize == 2) || (partySize <= 12)) {
					
						result = "Since you're hosting a semi-formal event for " + partySize + 
						" participants, you should serve fried chicken in your kitchen.";
				
					System.out.println(result);
					
					} else if (partySize >= 13) {
				
						result = "Since you're hosting a semi-formal event for " + partySize + 
						" participants, you should serve fried chicken by a caterer.";
				
					System.out.println(result);
				
					}
				
				}
		
		/* Logic for event type formal - the user enters 3.
		 * The nested if and else if statements covers the party sizes. */
		
				if (eventType == 3) {
					if (partySize == 1) {
				
						result = "Since you're hosting a formal event for 1 participant, you should"
						+ " serve chicken parmesan in the microwave.";
				
					System.out.println(result);
					
					} else if ((partySize == 2) || (partySize <= 12)) {
					
						result = "Since you're hosting a formal event for " + partySize + 
						" participants, you should serve chicken \n"
						+ "parmesan in your kitchen.";
				
					System.out.println(result);
					
					} else if (partySize >= 13) {
				
						result = "Since you're hosting a formal event for " + partySize + 
						" participants, you should serve chicken parmesan by a caterer.";
				
					System.out.println(result);
				
					}
			
				}
		
		
			}
			
			else {
				System.out.println("You must enter a number greater than 0 for party size");
			}
			
		
		scan.close();
		
		}
		
		else {
			System.out.println("You must enter a number greater than 0 for event type");
		}
				
	}
}
		


