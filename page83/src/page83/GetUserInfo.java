/**
 * 
 */
package page83;
import java.util.Scanner;
/**
 * @author CK121642
 *
 */
public class GetUserInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String name;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter your age >> ");
		age = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.print("Please enter your name >> ");
		name = inputDevice.nextLine();
		System.out.println("Your name is " + name + 
				" and you are " + age + " years old.");
		
		

	}

}
