import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Zadatak_3 {

	public static void main(String[] args) throws IOException {

		// C:\\Users\\Seka\\Desktop\\ZadaciFile_10\\src\\Text3.txt
		File fileName = new File("C:\\Users\\Seka\\Desktop\\ZadaciFile_10\\src\\Text3.txt");
		if (!fileName.exists()) {
			System.out.println("File ne postoji, kreirajte file..");
			fileName.createNewFile();
		}
		try {

			Scanner input = new Scanner(System.in);
			System.out.println("Unesite string: ");
			String s = input.nextLine();

			PrintWriter writer = new PrintWriter(fileName);
			writer.println(s);

			writer.close();

		} catch (Exception ex) {
			System.out.print(ex.getMessage());

		}

		java.io.File file = new java.io.File("Text3.txt");
		if (file.exists()) {

			System.out.println("File already exists");

			Scanner input = new Scanner(file);

			while (input.hasNextLine()) {

				String str = input.nextLine();

				String[] words = str.split(" ");
				String reversedString = "";

				for (int i = 0; i < words.length; i++) {
					String word = words[i];
					String reverseWord = "";

					for (int j = word.length() - 1; j >= 0; j--) {
						reverseWord = reverseWord + word.charAt(j);
					}
					reversedString = reversedString + reverseWord + " ";
					System.out.println(reversedString);

				}

			}
		}

	}

}
