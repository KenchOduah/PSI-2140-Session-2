package Chapter2;

import java.util.Scanner;
public class PracticeProblem2 {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		/* Creates a constant value that the monthlySaving will increase by */
		final double monthlyRate = .05/12;
		System.out.println("Enter the monthly saving amount: ");
		/*User inputs the amount they intend on putting into their savings account */
		double monthlySaving = 0;
		
		
		/* month1-6Value is the amount they will have in their 
		 * bank account after a number of months 
		 * Formula is amount you save per month * 1 + the amount you pay monthly(First one is done for you)*/
		
		double month1Value = monthlySaving * (1+monthlyRate);
		System.out.printf("After month 1, the account value is :$%.2f \n", month1Value);
		double month2Value = 0;
		System.out.printf("After month 2, the account value is :$%.2f \n", month2Value);
		double month3Value = 0;
		System.out.printf("After month 3, the account value is :$%.2f \n", month3Value);
		double month4Value = 0;
		System.out.printf("After month 4, the account value is :$%.2f \n", month4Value);
		double month5Value = 0;
		System.out.printf("After month 5, the account value is :$%.2f \n", month5Value);
		double month6Value = 0;
		System.out.printf("After month 6, the account value is :$%.2f \n", month6Value);
		

	}

}
