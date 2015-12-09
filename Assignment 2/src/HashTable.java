import java.util.Arrays;

public class HashTable {

	int[] theArray;
	int arraySize;
	// int itemsInArray = 0;

	public static void main(String[] args) {

		HashTable table = new HashTable(21);
		int[] elements = { 1, 5, 21, 26, 39, 14, 15, 16, 17, 18, 19, 20, 111, 145, 146 };
		table.hashFunction(elements, table.theArray);

	}

	public void hashFunction(int[] elementsArray, int[] theArray) {

		for (int n = 0; n < elementsArray.length; n++) {

			int element = elementsArray[n];

			int hashNum = element % 13;

		

			while (theArray[hashNum] != -1) {

				System.out.println("Collision occured at index " + hashNum);

				++hashNum;

				hashNum %= arraySize;
			}

			theArray[hashNum] = element;
			System.out.println("Element " + element + " stored at index " + hashNum);

		}
	}

	HashTable(int size) {

		arraySize = size;
		theArray = new int[size];
		Arrays.fill(theArray, -1);

	}

}
