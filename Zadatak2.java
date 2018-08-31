import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak2 {

	private static int i;

	public static void main(String[] args) throws FileNotFoundException {
		// src/Text2.txt

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite ime file: ");

		File fileName = new File(input.nextLine());
		if (!fileName.exists()) {
			System.out.println("File does not exist, terminating program.");
			System.exit(0);
		}
		int[] letterCount = new int[52];
		countLetter(fileName, letterCount);
		displayCount(letterCount);

	}

	public static void countLetter(File fileName, int[] letterCount) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try (Scanner reader = new Scanner(fileName);)

		{
			while (reader.hasNext()) {
				String fileLine = reader.nextLine();
				for (int i = 0; i < fileLine.length(); i++)
					if (Character.isAlphabetic(fileLine.charAt(i)))
						if (fileLine.charAt(i) <= 90)
							letterCount[fileLine.charAt(i) - 65]++;

						else if (fileLine.charAt(i) <= 122)
							letterCount[fileLine.charAt(i) - 71]++;
			}
		}
	}

	public static void displayCount(int[] letterCount) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 26; i++)
			;
		System.out.println((char) (i + 'A') + "'s je " + letterCount[i]);
		for (int i = 26; i < 52; i++)
			System.out.println((char) (i + 71) + "'s je " + letterCount[i]);
	}

}
