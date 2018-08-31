import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) throws FileNotFoundException {
		

		java.io.File file = new java.io.File("Text5.txt");
		if (file.exists()) {
			System.out.println("File already exists:");

			Scanner input = new Scanner(file);

			while (input.hasNext()) {

				String s = input.nextLine();
				int duzina = s.length();
				char[] c = new char[duzina];
				c = s.toCharArray();
				if (c.length > 40) {
					for (int i = 0; i < 40; i++) {

						System.out.print(c[i]);
					}
					System.out.print("...<Read More>");
					System.out.println();
				} else {
					for (int i = 0; i < c.length; i++) {
						System.out.print(c[i]);
					}
					System.out.println("");
				}

				try {
					input = new Scanner(new File("Txt5.txt"));

				} catch (Exception e) {

				}
			}
			while (input.hasNext()) {
				String s = input.next();
				System.out.print(s);

			}

		}
	}
}
