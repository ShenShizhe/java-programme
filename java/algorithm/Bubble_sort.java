public class Bubble_sort {	
	public static void swap(int [] arr,int i,int j) {
		int temp = arr [j];
		arr [j] = arr [i];
		arr [i] = temp;
	}	
	public static void bubbleSort(int [] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for (int i = arr.length-1; i >= 0; i--) {
			for (int second = 1; second <= arr.length-1; second++) {
				if(arr[second - 1] > arr[second]) {
					swap(arr,second-1,second);
				}
			}
		}
	}	
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] arr = {1,4,9,2,11,3,5,19,7,3,15,5,8};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
}
