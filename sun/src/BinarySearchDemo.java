
public class BinarySearchDemo {

	public static void main(String[] args) {
		int searchItem=9;
		BinarySearchDemo obj=new BinarySearchDemo();
		boolean status=obj.Search(searchItem);
		System.out.println(status);

	}
	int arr[]= {1,3,6,7,9,14,18,22,50};
	public boolean Search(int searchItem) {
		boolean isFound=false;
		int low=0;
		int high=arr.length-1;
		int mid=-1;
		int itr=0;
		while(low<=high) {
			itr++;
			mid=(low+high)/2;
			int arrvalue=arr[mid];
			if(searchItem==arrvalue) {
				isFound=true;
				break;
			}else if(searchItem<arrvalue){
				high=mid-1;
				
				
			}else {
				low=mid+1;
			}
				
			}
		System.out.println(itr);
			return isFound;
		}
	}


