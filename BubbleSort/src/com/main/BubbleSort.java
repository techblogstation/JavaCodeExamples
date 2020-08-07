package com.main;

public class BubbleSort {

	void bubbleSort(int elements[]) {

		int l = elements.length;

		for (int i = 0; i < l - 1; i++) {
			for (int j = 0; j < l - i - 1; j++) {

				if (elements[j] > elements[j + 1]) {
					int temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
	}

	void printElements(int elements[]) {

		int n = elements.length;

		for (int i = 0; i < n; ++i) {
			System.out.print(elements[i] + " , ");
		}
		System.out.println();

	}

	public static void main(String args[]) {

		BubbleSort bs = new BubbleSort();

		int elements[] = { 5, 2, 3, 6, 1, 4, 8 };

		System.out.println("Actual List of Elements: ");

		bs.printElements(elements);
		bs.bubbleSort(elements);

		System.out.println("Sorted List of Elements: ");

		bs.printElements(elements);
	}
}