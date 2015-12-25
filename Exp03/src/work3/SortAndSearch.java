package work3;

import java.util.*;

public class SortAndSearch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("输入若干整数元素: ");
		
		Scanner scanner = new Scanner((new Scanner(System.in)).nextLine());
		final int MAX_LENGTH = 10000;
		int[] input = new int[MAX_LENGTH];
		int count = 0;
		while(scanner.hasNextInt() && count < MAX_LENGTH)
			input[count++] = scanner.nextInt();
		int[] numbers = new int[count];
		System.arraycopy(input, 0, numbers, 0, count);
		//用List应该更高效的，可是Java里的List不好用
		
		System.out.print("快排前: ");
		for(int i : numbers)
			System.out.print(i + " ");
		System.out.println();
		
		sort(numbers);
		System.out.print("快排后: ");
		for(int i : numbers)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("输入需要搜索的元素: ");
		int aim = (new Scanner(System.in)).nextInt();
		int result = search(numbers, aim);
		if(result == -1)
			System.out.println("没有该元素 ");
		else
			System.out.println("该元素位于 " + result);
	}
	
	static void sort(int[] numbers){
		quickSort(numbers, 0, numbers.length - 1);
	}
	
	static int search(int[] numbers, int value){
		return binarySearch(numbers, value, 0, numbers.length - 1);
	}
	
	static void quickSort(int[] numbers, int start, int end){
		if(start >= end)
			return;
		int e = numbers[start];//枢轴元素
		int i = start;
		int j = end;
		while (i < j){
			while (i < j && numbers[j] >= e)	// 使j右边的元素不小于枢轴元素
				j--;
			if (i < j)
				numbers[i++] = numbers[j];

			while (i < j && numbers[i] <= e)	// 使i左边的元素不大于枢轴元素
				i++;
			if (i < j)
				numbers[j--] = numbers[i];
		}
		numbers[i] = e;
		if (start < i-1)	quickSort(numbers, start, i - 1);// 对子表numbers[low, i - 1]递归排序
		if (i + 1 < end) quickSort(numbers, i + 1, end);	// 对子表numbers[i + 1, high]递归排序
	}
	
	static int binarySearch(int[] numbers, int value, int start, int end){
		if(start > end)
			return -1;
		int mid = (start + end) / 2;
		if(numbers[mid] == value)
			return mid;
		if(numbers[mid] < value)
			return binarySearch(numbers, value, mid + 1, end);
		return binarySearch(numbers, value, start, mid - 1);
	}
}
