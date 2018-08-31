import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.soap.Text;

public class Zadatak_4 {

	public static void main(String[] args) throws FileNotFoundException {
		// prva reèenica u fileu “Hello World“ program treba da ispiše “World Hello“)
		// Text4.txt

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

		while (input.hasNextLine()) {
			String s = input.nextLine();
			String[] s1 = s.split(" ");
			for (int i = s1.length - 1; i >= 0; i--) {
				System.out.print(s1[i] + " ");
			}
			System.out.println(" ");
		}
		input.close();
	}

}
