import java.util.Scanner;

public class Number1{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int number = input.nextInt();

	if(number % 2 == 0){
	System.out.print("It is an even number");
	}
}
}