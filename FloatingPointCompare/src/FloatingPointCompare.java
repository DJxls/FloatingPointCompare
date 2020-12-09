import java.util.Scanner;

/**
 * Write a Java program that reads in two floating-point 
 * numbers and tests whether they are the same up to three 
 * decimal places
 * @author Darren
 *
 */

public class FloatingPointCompare {

	@SupressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean exit = false; 
		
		do { 
			System.out.println("Enter floating point 1: ");
			Scanner scanner = new Scanner(System.in); 
			String input1 = scanner.nextLine(); 
			
			System.out.println("Enter floating point 2: ");
			Scanner scanner2 = new Scanner(System.in); 
			String input2 = scanner2.nextLine(); 
			
			float float1 = parseFloat(input1);
			float float2 = parseFloat(input2); 
			
			int intFloat1 = (int) float1; 
			int intFloat2 = (int) float2; 
			
			System.out.println(intFloat1 == intFloat2 ? "Same" : "Different");
			
			System.out.println("Press q to quit, or press enter");
			scanner = new Scanner(System.in);
			String input3 = scanner.nextLine();
			
			if(input3.equals("q"))  {
				exit = true; 
				scanner.close();
				scanner2.close();
			}
			
		}while(!exit);
	}

	private static float parseFloat(String input1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
