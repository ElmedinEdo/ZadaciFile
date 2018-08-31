import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 1) {
			System.out.print("Argument nije pronaðen. ");
			System.exit(0);
		}
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file nije pronaðen! ");
			System.exit(1);
		}
		Scanner input = new Scanner(sourceFile);
		int karakteri = 0;
		int rijeèi = 0;
		int linije = 0;
		while (input.hasNext()) {
			String s = input.nextLine();
			linije++;
			String[] split = s.split(" ");
			for (int i = 0; i < split.length; i++)
				if (split[i].length() == 1)
					karakteri++;
				else
					rijeèi++;
		}
		System.out.print("File Text1.txt sadrži: ");
		System.out.println("\nLinije:" + linije + "\nRijeèi:" + rijeèi + "\nKarakteri:" + karakteri);
		input.close();

	}

}
