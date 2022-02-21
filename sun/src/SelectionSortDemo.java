
public class SelectionSortDemo {

	public static void main(String[] args) {
		new SelectionSortDemo().sort();	
		
	}
	int arr[]= {28,5,-21,6,49,3,5,77,3,2,42,0,5};
	public void sort() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
			
		}
		System.out.println("after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	}

}
	}
