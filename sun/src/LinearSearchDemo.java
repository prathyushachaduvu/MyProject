
public class LinearSearchDemo {

	public static void main(String[] args) {
		int searchItem=6;
		LinearSearchDemo demo=new LinearSearchDemo();
		boolean status=demo.linearSearch(searchItem);
		if(status) 
			System.out.println("Found");
			else 
				System.out.println("Not Found");
		}
	
	int arr[]= {4,5,2,1,8,9,6,7};
    public boolean linearSearch(int searchItem) {
	boolean isFound=false;
	int size=arr.length;
	System.out.println("The number of array elements present are:"+size);
	for (int i = 0; i < size; i++) {
		int value=arr[i];
		if(value==searchItem) {
			isFound=true;
			break;
			}
			
		}
		return isFound;
		}
	
}

