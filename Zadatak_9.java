import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_9 {

	public static void main(String[] args) throws FileNotFoundException {
	
		// (Reèenica “Hello world“ u outputu treba biti pretvorena u “Hello World“)
		// Text9.txt world World
		if (args.length != 3) {

			System.out.println("Argument nije pronaðen: file oldString newString ");
			System.exit(3);

		}

		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) {
			System.out.print("File not found! ");
			System.exit(1);
		}
		StringBuilder sb = new StringBuilder();
		try (Scanner input = new Scanner(sourceFile)) {

			while (input.hasNext()) {
				String s1 = input.nextLine();
				String s2 = s1.replaceAll(args[1], args[2]);
				sb.append(s2);
			}
		}
		try (PrintWriter writer = new PrintWriter(sourceFile)) {
			writer.printf("%s", sb.toString());
		}
	}

}
