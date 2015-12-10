package work3;

import java.util.*;

public class SortAndSearch {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner((new Scanner(System.in)).nextLine());
		final int MAX_LENGTH = 10000;
		int[] input = new int[MAX_LENGTH];
		int count = 0;
		while(scanner.hasNextInt() && count < MAX_LENGTH)
			input[count++] = scanner.nextInt();
		int[] numbers = new int[count];
		for(int i = 0; i < count; ++i)
			numbers[i] = input[i];
		//用List应该更高效的，可是Java里的List不好用
	}
	
	static void Sort(int[] numbers){
		
	}
	
	static int Search(int[] numbers, int value){
		return 0;
	}
	
	static void QuickSort(int[] numbers, int start, int end){
		
	}

}
