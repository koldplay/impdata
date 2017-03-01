package com.bizruntime.Task2;

public class Quicksort {
	
		private static int[] array;
		private static int[] tempMergeArray;
		private static int length;
		public static void main(String[] args) {
			
			int [] inputArray = {45,23,11,89,77,98,4,28,65,43};
			sort(inputArray);
			for (int i : inputArray) {
				System.out.println(i +" ");
			}
		}
		private static void sort(int[] inputArray) {
			
			array = inputArray;	
			length = inputArray.length;
			tempMergeArray = new int[length];
			doMergeSort(0,length-1);
		}
		public static void doMergeSort(int lowerIndex, int higherIndex) {
			
			if (lowerIndex < higherIndex) {
				
				int middle = lowerIndex+(lowerIndex - higherIndex)/2;
				doMergeSort(lowerIndex, middle);
				doMergeSort(middle+1, higherIndex);
				mergeParts(lowerIndex , middle ,higherIndex);
			}
			
		}
		public static void mergeParts(int lowerIndex, int middle, int higherIndex) {
			for (int i = lowerIndex; i <= higherIndex; i++) {
				tempMergeArray[i] = array[i];				
			}
			int i  = lowerIndex;
			int j  = middle+1; 
			int k  = higherIndex;
			while (i <= middle && j <= higherIndex) {
				if (tempMergeArray[i]  <= tempMergeArray[j]) {
					array[k] = tempMergeArray[i];
					i++;
				}else {
					array[k]= tempMergeArray[j];
					j++;
				}
				k++;
			}
			while (i <= middle) {
				array[k] = tempMergeArray[i];
				k++;
				i++;
			}
		}
		
}
