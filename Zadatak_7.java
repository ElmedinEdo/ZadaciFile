import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_7 {

	public static void main(String[] args) throws FileNotFoundException {
		// 7.Napisati program koji prima kao argument ime fiela. Nakon što je program
		// uèitao file,
		// nalazi predzadnju rijeè na svakoj liniji teksta te ispisuje istu korisniku.

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
		while (input.hasNext()) {
			String s = input.nextLine();

			String[] s1 = s.split(" ");
			if (s1.length > 2) {
				System.out.println(s1[s1.length - 2]);
			}

		}
		input.close();
	}

}