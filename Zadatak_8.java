import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_8 {

	public static void main(String[] args) throws FileNotFoundException {
		// Maloviski,malokoka-kola.

		java.io.File file = new java.io.File("Text8.txt");
		if (file.exists()) {
			System.out.println("File already exists");

			Scanner input = new Scanner(file);
			while (input.hasNext()) {

				String str = input.nextLine();

				for (int i = 0; i < str.trim().split("-", i).length; i++) {

					System.out.println(str.trim());

					try {
						input = new Scanner(new File("Text8.txt"));

					} catch (Exception e) {
						System.out.println("File ne postoji: ");
					}
				}

				    while (input.hasNext()) {
					String s = input.next();
					System.out.print(s);

				}

			}
		}
	}
}
