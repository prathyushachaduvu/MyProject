
public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int index = 0;
		for (int i =1; i <100; i++) {
		if(i%2==0 && index<arr.length) {
			arr[index] = i;
			index++;
		}
		}
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
		
			
		}
		// TODO Auto-generated method stub

	}

}
