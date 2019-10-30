package house;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		House house;
		Photo image;

		int identification;
		float price;
		String location;
		String advertiser;
		int length;
		int width;
		int count = 0;

		Scanner scanner = new Scanner(System.in);
		while (count < 3) {
			System.out.println("Please enter Id Number");
			identification = scanner.nextInt();
			System.out.println("Please enter price of house");
			price = scanner.nextFloat();
			System.out.println("Please enter location of house");
			location = scanner.next();
			System.out.println("Please enter advertister of house");
			advertiser = scanner.next();
			System.out.println("Please enter lenght of the photo");
			length = scanner.nextInt();
			System.out.println("Please enter width of the photo");
			width = scanner.nextInt();
			count++;
			image = new Photo(length, width);
			house = new House(identification, price, location, advertiser, image);

		}
		scanner.close();
	}
}