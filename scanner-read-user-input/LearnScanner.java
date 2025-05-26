package java2025;
import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {

		System.out.println("Enter text and hit enter:");

		var content = new Scanner(System.in);

		String currentValue = content.nextLine();

		System.out.println(currentValue);

		if (currentValue.equals("")) {
			System.out.println("Missing input!");
		} else {
			System.out.println(currentValue.toUpperCase());
		}


	}

}
