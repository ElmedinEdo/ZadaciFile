import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 1) {
			System.out.print("Argument nije prona�en. ");
			System.exit(0);
		}
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.println("Source file nije prona�en! ");
			System.exit(1);
		}
		Scanner input = new Scanner(sourceFile);
		int karakteri = 0;
		int rije�i = 0;
		int linije = 0;
		while (input.hasNext()) {
			String s = input.nextLine();
			linije++;
			String[] split = s.split(" ");
			for (int i = 0; i < split.length; i++)
				if (split[i].length() == 1)
					karakteri++;
				else
					rije�i++;
		}
		System.out.print("File Text1.txt sadr�i: ");
		System.out.println("\nLinije:" + linije + "\nRije�i:" + rije�i + "\nKarakteri:" + karakteri);
		input.close();

	}

}
