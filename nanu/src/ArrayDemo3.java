
public class ArrayDemo3 {

	public static void main(String[] args) {
		//int[][]arr=new int[3][2];
		int[][] arr= { {1, 2},
			           {3, 4},
				      {5, 6}};
		
		for(int row = 0;row<3;row++) {
			for(int col =0;col<2;col++) {
				System.out.print(arr[row][col] +" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
