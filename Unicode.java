package mypackage;


import java.util.Scanner;


public class Unicode {
	
	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
		
		String string1 = new String();
		
		System.out.println("Enter the first string: ");
		string1 = scan.nextLine();
		
		System.out.println();
		
		System.out.println("Enter the second string: ");
		String string2 = scan.nextLine();
		
		char[] firstCharArray = string1.toCharArray();
		
		char[] secondCharArray = string2.toCharArray();
		
		//System.out.println("The size of string1 is: " + string1.length());
		//System.out.println("The number of characters in string1 is: " + firstCharArray.length);
		
		System.out.println();
		int sum = 0;
		int sum1 = 0;
		
		for (int x=0; x< string1.length(); x++) {
			
			 System.out.println(firstCharArray[x] + ":" + (int) firstCharArray[x]); 
			 int[] a = { (int) firstCharArray[x] };
		
			 int i;
			 
				for (i = 0; i < a.length; i++) {
					sum += a[i];
					
				}
				
		}
		
		System.out.println();
		
		System.out.println(sum);
		
		System.out.println();
		
		for (int y=0; y<string2.length(); y++) {
			 
			 System.out.println(secondCharArray[y] + ":" + (int) secondCharArray[y]);
			 int[] b = { (int) secondCharArray[y] };
			 
			 int j;
			 
				for (j = 0; j < b.length; j++) {
					sum1 += b[j];
					
				}
			 
		 }
		
		System.out.println();
		System.out.println(sum1);
		System.out.println();
		
		System.out.println("The difference as an absolute value is: " + Math.abs(sum - sum1));
		
		scan.close();
	       
	} 
}


