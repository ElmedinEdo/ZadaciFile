import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_6 {

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
		int max = 0;
		int index = 0;
		while (input.hasNextLine()) {
			String s = input.nextLine();
			String[] s1 = s.split(" ");
			for (int i = s1.length - 1; i >= 0; i--) {
				if (s1[i].length() > max) {
					max = s1[i].length();
					index = i;
				}
			}
			System.out.println(s1[index]);
		}
		input.close();
	}

}
