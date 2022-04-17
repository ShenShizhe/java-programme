public class Selection_sort {
	//抽出最小值
	public static void selectSort(int [] arr) {
		if(arr == null || arr.length < 2) { //考虑边界值情况
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			int minValueIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				minValueIndex = arr[j] < arr[minValueIndex] ? j:minValueIndex;
			}
			swap(arr,i,minValueIndex);
		}
	}
	
	//交换方法
	public static void swap(int [] arr,int i,int j) {
		int temp = arr [j];
		arr [j] = arr [i];
		arr [i] = temp;
	}
  
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
  
	public static void main(String[] args) {
		int [] arr = {1,4,9,2,11,3,5,19,7,3,15,5,8};
		printArray(arr);//未进行排序的数组
		selectSort(arr);
		printArray(arr);//已经进行排序的数组
	}
}
