import java.util.Scanner;

public class ModulusChallenges
	{

		public static void main(String[] args)
			{
				challenge1();
				challege2();

			}

		

		private static void challenge1()
			{
				
				while (true){
				System.out.println("Pick a year and see is that a leap year or not");
				Scanner userInput = new Scanner(System.in);
				int year = userInput.nextInt();
				
				if(year % 100 == 0){
					if(year % 400 == 0){
						System.out.println("This is a leap year");
					}
					else{
						System.out.println("This is not a leap year");
					}
				}
				else{
					if (year % 4 == 0 && year % 100 > 0){
						System.out.println("This is a leap year");
					}
					else{
						System.out.println("This is not a leap year");
					}
				}
			}
	}
		private static void challege2()
			{
				
				
				
						for (int number = 1; number < 100; number ++ ){
							
							
							if (number % 5 == 0 && number % 3 == 0){
								System.out.println("FizzBuzz");
							}
														
							else if (number % 5 == 0){
								System.out.println("Buzz");
							}
							
							else if (number % 3 == 0){
								System.out.println("Fizz");
							}
							
							
							
							else{
								System.out.println(number);
							}
							
						
							
							
				
			}
		
			}
	}
