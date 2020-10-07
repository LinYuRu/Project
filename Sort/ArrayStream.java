package Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrayStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an integer array
		int arr[] = { 1, 2, 3, 4, 5 };
		int numbers[] = { 9, 8, 7, 6, 3, 1 };

		// Using Arrays.stream() to convert
		// array into Stream
		IntStream stream = Arrays.stream(numbers);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
		
		System.out.println();

		Arrays.parallelSort(numbers);
		stream = Arrays.stream(numbers);

		// Displaying elements in Stream
		stream.forEach(str -> System.out.print(str + " "));
	}

}
