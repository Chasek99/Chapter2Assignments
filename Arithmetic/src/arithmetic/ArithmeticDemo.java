/**
 * 
 */
package arithmetic;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class ArithmeticDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integert >> ");
		firstNumber = input.nextInt();
		
		System.out.print("Please enter another integer >> ");
		secondNumber = input.nextInt();
		
		sum = firstNumber + secondNumber;
		difference = firstNumber - secondNumber;
		average = sum /2;
		
		System.out.println(firstNumber + " + " + secondNumber + "=" + sum);
		System.out.println(firstNumber + " - " + secondNumber + "=" + difference);
		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + average);



	}

}
