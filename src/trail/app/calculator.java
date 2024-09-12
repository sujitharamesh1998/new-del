package trail.app;

import java.util.Scanner;

public class calculator {
		public static void main(String[] args) {
			
			calculator calc = new calculator();
			calc.demo();
			
		}
		
		public void demo()
		{
			int num1, num2;
			Scanner in = new Scanner(System.in);
			System.out.println("Enter first number");
			num1 = in.nextInt();

			System.out.println("Enter second number");
			num2 = in.nextInt();

			System.out.println("Sum = " + (num1 + num2));
			System.out.println("Subtraction = " + (num1 - num2));
			System.out.println("Multiplication = " + (num1 * num2));
			System.out.println("Division = " + (num1 / num2));
			
			System.out.println("want to calculate again : ");
			Scanner inn = new Scanner(System.in);
			String result = "";
			result = inn.next();
			if(result.equals("yes"))
				demo();
			else if(result.equals("no"))
			{
				System.exit(0);
			}
			else
			{
				System.exit(0);
			}
		}

	}
	
