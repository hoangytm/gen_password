package Genatare_Random_Password;

import java.util.*;

public class Genatare_Random_Password {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" the length of your password: ");
			int len = scanner.nextInt();

			System.out.println(geek_Password(len));
		}
	}

	static char[] geek_Password(int len) {
		System.out.println("Generating password using random() : ");
		System.out.print("Your new password is : ");

		String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Small_chars = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String symbols = "!@#$%^&*_=+-/.?<>)";

		String values = Capital_chars + Small_chars + numbers + symbols;

		// Using random method
		Random rndm_method = new Random();

		char[] password = new char[len];

		for (int i = 0; i < len; i++) {

			password[i] = values.charAt(rndm_method.nextInt(values.length()));

		}
		int rd1;
		int rd2;
		int rd3;
		while (true) {
			rd1 = rndm_method.nextInt(len);
			rd2 = rndm_method.nextInt(len);
			rd3 = rndm_method.nextInt(len);
			if (!((rd1 == rd2) || (rd2 == rd3))) {
				break;
			}
		}

		password[rd1] = Capital_chars.charAt(rndm_method.nextInt(Capital_chars.length()));
		password[rd2] = numbers.charAt(rndm_method.nextInt(numbers.length()));
		password[rd3] = symbols.charAt(rndm_method.nextInt(symbols.length()));
		return password;
	}
}
