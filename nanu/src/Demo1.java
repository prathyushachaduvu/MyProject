import java.util.ArrayList;
public class Demo1 {

	public static void main(String[] args) {
		//Employee e = new Employee();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(200);
		list.add(100);		
		list.add(310);		
		list.add(140);		
		//list.add(10.7d);	
		//list.add("Hello");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
			
		
		
		
		// TODO Auto-generated method stub

	}

}
//class Employee{}
