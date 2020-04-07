package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String arr[] = { "abc", "df", "g", "h", "i" };

		String[] arr2 = new String[5];
		arr2[0] = "apple";
		arr[1] = "pear";
		// 2. print the third element in the array
		System.out.println(arr[2]);
		// 3. set the third element to a different value
		arr[2] = "abcdefghi";
		// 4. print the third element again
		System.out.println(arr[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < arr.length; i++) {
			arr[i] = "r";
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
		// 7. make an array of 50 integers
		int[] num = new int[50];
		// 8. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < num.length; i++) {
			Random rand = new Random();
			num[i] = rand.nextInt(50);
		}
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = 10;
		for (int i = 0; i < num.length; i++) {
			if (i < 49) {
				if (smallest > num[i]) {
					smallest = num[i];
				}
			}
		}
		System.out.println("" + smallest);

		// 10 print the entire array to see if step 8 was correct
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

		// 11. print the largest number in the array.
		int largest = 10;
		for (int i = 0; i < num.length; i++) {
			if (i < 49) {
				if (largest < num[i]) {
					largest = num[i];
				}
			}
		}
		System.out.println("" + largest);

		// 12. print only the last element in the array
		System.out.println(num[49]);
	}
}
