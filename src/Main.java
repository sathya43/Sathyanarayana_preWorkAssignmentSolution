import java.util.Scanner;



public class Main {
	Scanner sc = new Scanner(System.in);

	//function to checkPalindrome 
	public void checkPalindrome()  {
		System.out.println("Enter a number: ");
		long number = sc.nextLong();
		long reverse = 0, temp = number;
		
		while(temp > 0) {
			long reminder = temp % 10;
			reverse = reverse * 10 + reminder;
			temp = temp / 10;
		}
		
		//If reverse of the number is the same as the entered number then the number is a palindrome
		if(reverse == number) {
			System.out.println("The entered number " + number + " is a palindrome\n");
		}else {
			System.out.println("The entered number " + number + " is not a palindrome\n");
		}
	}

	//function to printPattern
	public void printPattern() {
		System.out.println("Enter a number: ");
		int number  = sc.nextInt();
		
		for(int iteration = 0; iteration < number; iteration++) {
            int numberOfStars = (number - iteration);
            for(int col = 0; col < numberOfStars; col++) {
            	System.out.print("*");
            }
            System.out.println();
		}
		

	}

	//function to check no is prime or not
	public void checkPrimeNumber() {
		System.out.println("Enter a number: ");
		long number = sc.nextLong();
		long numberOfMultiples = 0;
		
		//A prime number has only two multiples 1 and the number itself
		for(long iterator = 1 ; iterator <= number; iterator++) {
			if( number % iterator == 0) {
				numberOfMultiples++;
			}
		}
		
		if(numberOfMultiples > 2) {
			System.out.println("The entered number " + number + " is not a prime number\n");
		} else {
			System.out.println("The entered number " + number +" is a prime number\n");
		}
		

	}

	// function to print Fibonacci Series
	public void printFibonacciSeries() {

		//initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;
		System.out.println("Enter number of terms to be printed in fibonacci series: ");
		int numberOfTermsInSeries = sc.nextInt();
		System.out.print("0,1");
		
		//For finding the nth number of a fibonacci series we need (n-1)th number and (n-2)th number
		int prevNum1 = second, prevNum2 = first, currNumber = 0;
		for(int i = 2; i < numberOfTermsInSeries; i++) {
			currNumber = prevNum1 + prevNum2;
			System.out.print("," + currNumber);
			prevNum2 = prevNum1;
			prevNum1 = currNumber;
		}
        System.out.println();
	}

	//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {
            System.out.println("Enter your choice from below list.\n" + "1. Find if a number is a palindrome .\n"
                               + "2. Print Pattern based on a given no.\n" + "3. Check whether the no is a  prime number.\n"
                               + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            System.out.println();
           
            choice = sc.nextInt();

			switch (choice) {
                case 0: {
                  choice = 0;
                  break;
                }
                case 1: {
                  obj.checkPalindrome();
                  break;
                }
               case 2: {
                  obj.printPattern();
             	  break;
			    }
               case 3: {
                   obj.checkPrimeNumber();
                   break;
                }
                case 4: {
                   obj.printFibonacciSeries();
                   break;
			    }
                default:
                  System.out.println("Invalid choice. Enter a valid no.\n");
            }
       } while (choice != 0);
       System.out.println("Exited Successfully!!!");
       sc.close();
   }

}

