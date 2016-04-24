import java.util.Scanner;


public class Week10Lab2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
	
		int myRandomNum ;		
		
		int numberGuess;
		
		int lowNumber;
		
		int highNumber;
	
		RandomNumber2 randomNumber= new RandomNumber2();
		
	
		System.out.print("Enter a number low random: ");
		lowNumber= input.nextInt();
		randomNumber.SetLowNumber(lowNumber);
	
		System.out.print("Enter a number high random: ");
		highNumber= input.nextInt();
		
		randomNumber.SetHighNumber(highNumber);
		System.out.printf("Please enter a number between %d and %d: ",lowNumber,highNumber);
		numberGuess=input.nextInt();
		myRandomNum=randomNumber.GetANumber();
		
		if (numberGuess==myRandomNum)
		System.out.printf("Congrats, you guessed it right. The correct number is %f\n",numberGuess);
		else if (numberGuess > myRandomNum)
		System.out.printf("Your number is too big. You number is %d , computer number is %d ",numberGuess,myRandomNum);
		else
		System.out.printf("Your number is too small.You number is %d , computer number is %d ",numberGuess,myRandomNum);
	}

}