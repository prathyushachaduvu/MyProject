
public class Demo {

	public static void main(String[] args) {
		int[] arr=new int[7];
		arr[0]=10;
		arr[3]=25;
		arr[4]=70;
		//arr[4]=100;
		//int SearchEle =1;
		//boolean ispresent = true;
		System.out.println("Initial array");
		for(int i =0;i<arr.length;i++){
			System.out.println("Index is:"+i+", and value is:"+arr[i]);
			
		}
		System.out.println("Upadating array");
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]>0) {
				arr[i] =arr[i]+10;
			}
		}
		System.out.println("Updated array");
		for(int i = 0; i < arr.length;i++) {
			System.out.println("Index is:"+i+", and value is:"+arr[i]);
		}
		// TODO Auto-generated method stub

	}

}
