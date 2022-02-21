import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;

//import java.util.TreeSet;


public class SetDemo {

	public static void main(String[] args) {
		//String s="hello";
		//System.out.println(s.hashCode());
		//String ss = new String("hello");
		//System.out.println(ss.hashCode());
		HashSet<Integer> set = new HashSet<>();
		//TreeSet<Integer> set=new TreeSet<>(); 
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(50);
		set.add(80);
		set.add(90);
		set.add(60);
		
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			int value =it.next();
			System.out.println(value);
			}
		
		// TODO Auto-generated method stub

	}

}
