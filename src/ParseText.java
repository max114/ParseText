
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParseText {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new FileReader("file"));
		String str = null;
		String[] wordNums = { "Zero", "one", "One", "two", "Three", "Four", "Five", "six", "seven", "eight", "Nine",
				"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "Eighty", "Ninety", "hundred", "Thousand",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		List<String> wordNumList = Arrays.asList(wordNums);
		Scanner scanner = new Scanner(new File("file"));
		while ((scanner.hasNext())) {
			String s = scanner.next();
			if (wordNumList.contains(s)) {
				System.out.println(s);
			}
		}

		while ((str = in.readLine()) != null) {
			String numberOnly = str.replaceAll("[^\\d]", "");
			numberOnly.trim();
			System.out.print(numberOnly);
		}
		in.close();
	}

}

