import java.util.LinkedList;
public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedList list1=new DoubleLinkedList();
		
		list1.add(2);
		list1.add(4);
		list1.add(9);
		list1.display();
		list1.add(10);
		list1.display();
		System.out.println("Data in reverse order");
		list1.displayInReverse();
		}

}
class Noden {
	Noden previousAddress;
	int data;
	Noden nextAddress;
	}

class DoubleLinkedList{
	private Noden head=null;
	private Noden tail=null;
	private int size=0;
	public void add(int value) {
		Noden node1=new Noden();
		node1.data=value;
		node1.previousAddress=null;
		node1.nextAddress=null;
		if(head==null) {
			head=node1;
			tail=node1;
			
		}else {
			tail.nextAddress=node1;
			node1.previousAddress=tail;
			tail=node1;
			
		}
		}
	
	public void display() {
		Noden temp = head;
		while (temp!=null) {
			System.out.print("current noden Add:"+temp);
			System.out.print("P Add:"+temp.previousAddress);
			System.out.print("Data:"+temp.data);
			System.out.print("N Add:"+temp.nextAddress);
			System.out.print("-------------------------------------------------------------");
			temp=temp.nextAddress;
		}
			}
	public void displayInReverse() {
		Noden temp = tail;
		while (temp!=null) {
			//System.out.print("current node Add:"+temp);
			System.out.print("P Add:"+temp.previousAddress);
			System.out.print("Data:"+temp.data);
			System.out.print("N Add:"+temp.nextAddress);
			System.out.print("-------------------------------------------------------------");
			temp=temp.previousAddress;
			}
		}
	}
		
		
		
	
	
