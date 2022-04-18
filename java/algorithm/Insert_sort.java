public class Insert_sort {	
	public static void swap(int [] arr,int i,int j) {
		int temp = arr [j];
		arr [j] = arr [i];
		arr [i] = temp;
	}		
	public static void insertSort(int [] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		for(int end = 1;end < arr.length;end ++) {
			int newNumIndex = end;
			while(newNumIndex - 1 >= 0 && arr[newNumIndex-1] > arr[newNumIndex]) {
				swap(arr,newNumIndex-1,newNumIndex);
				newNumIndex --;				
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
		insertSort(arr);
		printArray(arr);
	}
}
