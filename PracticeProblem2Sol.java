package Chapter2;

import java.util.Scanner;
public class PracticeProblem2Sol {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		/* Creates a constant value that the monthlySaving will increase by */
		final double monthlyRate = .05/12;
		System.out.println("Enter the monthly saving amount: ");
		/*User inputs the amount they intend on putting into their savings account */
		double monthlySaving = input.nextInt();
		/* month1-6Value is the amount they will have in their 
		 * bank account after a number of months */
		
		double month1Value = monthlySaving * (1+monthlyRate);
		System.out.printf("After month 1, the account value is :$%.2f \n", month1Value);
		double month2Value = (month1Value + monthlySaving) * (1+monthlyRate);
		System.out.printf("After month 2, the account value is :$%.2f \n", month2Value);
		double month3Value = (month2Value + monthlySaving) * (1+monthlyRate);
		System.out.printf("After month 3, the account value is :$%.2f \n", month3Value);
		double month4Value = (month3Value + monthlySaving) * (1+monthlyRate);
		System.out.printf("After month 4, the account value is :$%.2f \n", month4Value);
		double month5Value = (month4Value + monthlySaving) * (1+monthlyRate);
		System.out.printf("After month 5, the account value is :$%.2f \n", month5Value);
		double month6Value = (month5Value + monthlySaving) * (1+monthlyRate);
		System.out.printf("After month 6, the account value is :$%.2f \n", month6Value);
		

	}

}

