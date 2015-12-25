package work3;

import java.util.*;

public class SortAndSearch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.print("������������Ԫ��: ");
		
		Scanner scanner = new Scanner((new Scanner(System.in)).nextLine());
		final int MAX_LENGTH = 10000;
		int[] input = new int[MAX_LENGTH];
		int count = 0;
		while(scanner.hasNextInt() && count < MAX_LENGTH)
			input[count++] = scanner.nextInt();
		int[] numbers = new int[count];
		System.arraycopy(input, 0, numbers, 0, count);
		//��ListӦ�ø���Ч�ģ�����Java���List������
		
		System.out.print("����ǰ: ");
		for(int i : numbers)
			System.out.print(i + " ");
		System.out.println();
		
		sort(numbers);
		System.out.print("���ź�: ");
		for(int i : numbers)
			System.out.print(i + " ");
		System.out.println();
		
		System.out.print("������Ҫ������Ԫ��: ");
		int aim = (new Scanner(System.in)).nextInt();
		int result = search(numbers, aim);
		if(result == -1)
			System.out.println("û�и�Ԫ�� ");
		else
			System.out.println("��Ԫ��λ�� " + result);
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
		int e = numbers[start];//����Ԫ��
		int i = start;
		int j = end;
		while (i < j){
			while (i < j && numbers[j] >= e)	// ʹj�ұߵ�Ԫ�ز�С������Ԫ��
				j--;
			if (i < j)
				numbers[i++] = numbers[j];

			while (i < j && numbers[i] <= e)	// ʹi��ߵ�Ԫ�ز���������Ԫ��
				i++;
			if (i < j)
				numbers[j--] = numbers[i];
		}
		numbers[i] = e;
		if (start < i-1)	quickSort(numbers, start, i - 1);// ���ӱ�numbers[low, i - 1]�ݹ�����
		if (i + 1 < end) quickSort(numbers, i + 1, end);	// ���ӱ�numbers[i + 1, high]�ݹ�����
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
