package work1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Jason Song(wolfogre@outlook.com) on 12/24/2015.
 */
public class SortAndSearch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Please input some integers: ");

		Scanner scanner = new Scanner((new Scanner(System.in)).nextLine());
		final int MAX_LENGTH = 10000;
		int[] input = new int[MAX_LENGTH];
		int count = 0;
		while(scanner.hasNextInt() && count < MAX_LENGTH)
			input[count++] = scanner.nextInt();
		int[] numbers = new int[count];
		System.arraycopy(input, 0, numbers, 0, count);
		//TODO:it would be better to use List

		{
			//use Arrays.sort()
			int[] tempNumbers = numbers.clone();
			System.out.print("Before Arrays.sort(): ");
			for(int i : tempNumbers)
				System.out.print(i + " ");
			System.out.println();
			Arrays.sort(tempNumbers);
			System.out.print("After Arrays.sort(): ");
			for(int i : tempNumbers)
				System.out.print(i + " ");
			System.out.println();

			//use Arrays.binarySearch()
			System.out.print("Please input the integer to search: ");
			int aim = (new Scanner(System.in)).nextInt();
			int result = Arrays.binarySearch(tempNumbers, aim);
			if(result == -1)
				System.out.println("There is not " + aim);
			else
				System.out.println("The index is " + result);
		}

		{
			//use bubbleSort()
			int[] tempNumbers = numbers.clone();
			System.out.print("Before bubbleSort(): ");
			for(int i : tempNumbers)
				System.out.print(i + " ");
			System.out.println();
			bubbleSort(tempNumbers);
			System.out.print("After bubbleSort(): ");
			for(int i : tempNumbers)
				System.out.print(i + " ");
			System.out.println();

			//use binarySearch()
			System.out.print("Please input the integer to search: ");
			int aim = (new Scanner(System.in)).nextInt();
			int result = binarySearch(tempNumbers, aim);
			if(result == -1)
				System.out.println("There is not " + aim);
			else
				System.out.println("The index is " + result);
		}

		{
			//use selectionSort()
			int[] tempNumbers = numbers.clone();
			System.out.print("Before selectionSort(): ");
			for(int i : tempNumbers)
				System.out.print(i + " ");
			System.out.println();
			selectionSort(tempNumbers);
			System.out.print("After selectionSort(): ");
			for(int i : tempNumbers)
				System.out.print(i + " ");
			System.out.println();

			//use binarySearch()
			System.out.print("Please input the integer to search: ");
			int aim = (new Scanner(System.in)).nextInt();
			int result = binarySearch(tempNumbers, aim);
			if(result == -1)
				System.out.println("There is not " + aim);
			else
				System.out.println("The index is " + result);
		}

	}

	static int binarySearch(int[] numbers, int value){
		return binarySearchHelp(numbers, value, 0, numbers.length - 1);
	}
	static int binarySearchHelp(int[] numbers, int value, int start, int end){
		if(start > end)
			return -1;
		int mid = (start + end) / 2;
		if(numbers[mid] == value)
			return mid;
		if(numbers[mid] < value)
			return binarySearchHelp(numbers, value, mid + 1, end);
		return binarySearchHelp(numbers, value, start, mid - 1);
	}

	static void bubbleSort(int[] numbers) {
		for(int i = numbers.length - 1; i >= 0; --i){
			for(int j = 0; j < i;  ++j){
				if(numbers[j] > numbers[i]){
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	static void selectionSort(int[] numbers) {
		int disorderStart = 0;
		while(disorderStart < numbers.length - 1){
			int minIndex  = disorderStart;
			int min = numbers[minIndex];
			for(int i = disorderStart; i < numbers.length; ++i){
				if(numbers[i] < min){
					minIndex = i;
					min = numbers[i];
				}
			}
			int temp = numbers[disorderStart];
			numbers[disorderStart] = numbers[minIndex];
			numbers[minIndex] = temp;
			++disorderStart;
		}
	}

}
