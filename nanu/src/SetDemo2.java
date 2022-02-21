import java.util.LinkedList;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		Test t = new Test();
		boolean status = t.findValue(40);
		if(status) {
			System.out.println("The value is present");
			}
		else {
				System.out.println("The value is not present");
			}
		// TODO Auto-generated method stub

	}

}
class Test{
	public boolean findValue(int input) {
		boolean status = false;
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(40);
		list.add(50);
		list.add(20);
		list.add(70);
		status = list.contains(input);
		return status;
		//ListIterator<Integer> li = list.listIterator();
		//while(li.hasNext()) {
			//int value =li.next();
		//	System.out.println(value);
		}
		
	}

