import java.util.Scanner;
public class Program {
	public static void main(String args[])
	{
		System.out.println("Please input a string:");
		Scanner reader = new Scanner(System.in);
		String inputString = reader.nextLine();
		reader.close();
		WordCounter wordCounter = new WordCounter(inputString);
		System.out.println("There are " + wordCounter.GetWordCount() + " words,");
		System.out.println("they are:");
		for(String str: wordCounter.GetWords())
		{
			System.out.println(str);
		}
		Integer numCount = 0, letterCount = 0, punCount = 0;
		wordCounter.GetCharCount(numCount, letterCount, punCount);
		System.out.println("There are " + numCount.intValue() + " numbers, " + 
				+ letterCount.intValue() + " letters and "
				+ punCount.intValue() + " punctuations.");
	}
}
