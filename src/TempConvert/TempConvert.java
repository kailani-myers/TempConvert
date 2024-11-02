package TempConvert;
import java.util.Scanner;

public class TempConvert {
	
	public static void main(String[] args) {
		//this program converts an user input of a Celsius 
		//temperature to an output of Fahrenheit temperature
		
		//explanation message
		System.out.println("This program converts your Celsius temperature doubleo Fahrenheit or vice versa.");
		System.out.println("		-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

		//this asks if the user needs to convert celsius or fahrenheit
		Scanner userInput = new Scanner(System.in);
		System.out.println("Is your temperature in Celsius or Fahrenheit (C/F)? ");
		String question = userInput.nextLine();
		String lowered = question.toLowerCase();
		
		//this converts the temperature depending on the answer to the last question
		if (lowered.equals("c")) {
			//This asks for a temperature in Celsius from the user
			System.out.println("Please enter a temperature in Celsius: ");
			double celsius = userInput.nextDouble();
			System.out.println("Temperature you entered: " + celsius + " Celsius");
			tempConvertor(celsius);
		}else if (lowered.equals("f")){
			//this asks the user for a temperature in fahrenheit
			System.out.println("Please enter a temperature in Fahrenheit: ");
			double fahrenheit = userInput.nextDouble();
			System.out.println("Temperature you entered: " + fahrenheit + " Fahrenheit");
			tempConvertor2(fahrenheit);
		}else {
			//if the user inputs an invalid response, this occurs
			System.out.println("That is not a valid response. ");
			userInput.close();
		}
		userInput.close();
	}
	
	//this converts the user input of celsius to Fahrenheit and prints it
	public static double tempConvertor(double celsius) {
		double fraction = celsius*1.8;
		double newTemp = fraction+32;
		System.out.println("Your temperature in Fahrenheit: " + newTemp + " Fahrenheit");
		return newTemp;
		
	}
	//this converts the user input of fahrenheit to celsius and prints it
		public static double tempConvertor2(double fahrenheit) {
			double fraction = fahrenheit-32;
			double newTemp = fraction*1.8;
			System.out.println("Your temperature in Celsius: " + newTemp + " Celsius");
			return newTemp;
			
		}
		
}
