
public class CheckedDemo {

	public static void main(String[] args) {
		String s = "good";
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(s.charAt(i));
				
			}
		}catch(Exception e){
			e.printStackTrace();
			
		}finally {
			System.out.println("want well");
		}
		
		// TODO Auto-generated method stub

	}

}
