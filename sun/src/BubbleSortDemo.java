
public class BubbleSortDemo {

	public static void main(String[] args) {
		new BubbleSortDemo().sortArray();	
	}
	int arr[]= {28,5,-21,6,49,3,5,77,3,2,42,0,5};
	public void sortArray() {
		int size =arr.length;
		for (int i = 1; i < size; i++) {
			for(int j=1;j<size;j++) {
				if(arr[j-1]>arr[i]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
			System.out.println("End of the iteration");
			for(int j=1;j<size;j++) {
				System.out.println(arr[j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	

}
