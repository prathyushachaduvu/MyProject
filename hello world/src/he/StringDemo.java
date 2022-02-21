package he;

public class StringDemo {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.hashCode());
		str = str.concat("all"); 
		 System.out.println(str);	
		System.out.println(str.hashCode());	
		StringBuffer ss =new StringBuffer("hai");
		ss = ss.append("all");
		System.out.println(ss);
		
		
		
		StringBuilder sa=new StringBuilder("hi");
		System.out.println(sa);			
		

		
		
		// TODO Auto-generated method stub
	}

}
