package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] arr = new String[5];
		arr[0]= "a";
		arr[1]= "b";
		arr[2]= "c";
		arr[3]= "d";
		arr[4]= "e";
		print(arr);
		reverse(arr);
	 other(arr);
		random(arr);
		
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void print(String[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	 //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void reverse(String[] arr) {
		
		
	
			System.out.println(arr[4]);
			System.out.println(arr[3]);
			System.out.println(arr[2]);
			System.out.println(arr[1]);
			System.out.println(arr[0]);
		
		
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void other(String[] arr) {
	
		
	
			System.out.println(arr[0]);
			System.out.println(arr[2]);
			System.out.println(arr[4]);
		
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void random(String[] arr) {
		Random rand = new Random();
		int num = rand.nextInt(4);
		int num1 = rand.nextInt(4);
		int num2 = rand.nextInt(4);
		int num3 = rand.nextInt(4);
		int num4 = rand.nextInt(4);

	System.out.println(arr[num]);
	System.out.println(arr[num1]);
	System.out.println(arr[num2]);
	System.out.println(arr[num3]);
	System.out.println(arr[num4]);

		
	}
	
}
