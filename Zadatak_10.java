import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_10 {
	public static void main(String[] args) throws IOException {

		File fileName = new File("C:\\Users\\Seka\\Desktop\\ZadaciFile_10\\src\\Text10.txt");
		if (!fileName.exists()) {
			System.out.println("File ne postoji, kreirajte file..");
			fileName.createNewFile();
		}
		try {
			Random randNumbers = new Random();
			Scanner input = new Scanner(System.in);
			System.out.println("Unesite velièinu liste: ");
			int size = input.nextInt();

			PrintWriter writer = new PrintWriter(fileName);
			for (int i = 0; i < size; i++)
				if (i % 10 == 0)
					writer.println(randNumbers.nextInt(size));
				else
					writer.print(randNumbers.nextInt(size) + " ");

			writer.close();

			input.close();

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}

		try (Scanner textReader = new Scanner(fileName)) {

			ArrayList<Integer> list = new ArrayList<>();
			while (textReader.hasNext())
				list.add(textReader.nextInt());

			for (int i = 0; i < list.size(); i++)
				if (i % 2 != 0)
					System.out.println(list.get(i) + " ");

		} catch (Exception ex) {
			System.out.print(ex.getMessage());
		}
	}

}
