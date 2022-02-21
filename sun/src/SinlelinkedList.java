import java.util.LinkedList;

public class SinlelinkedList {

	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		//System.out.println(list.isEmpty());
		list.add(4);
		list.add(8);
		list.add(10);
		list.add(45);
		System.out.println("displaying data:"+list.size());
		//System.out.println(list.isEmpty());
		list.display();
		list.remove(1);
		System.out.println("displaying data after removing 2nd index");
		list.display();
		
		//System.out.println("displaying data");
		list.display();

	}

}
class Node{
	int data;
	Node address;
}
class MyLinkedList{
	private Node head=null;
	private Node tail=null;
	private int size=0;
	public void add(int data) {
		
	size++;
		Node node=new Node();
		node.data=data;
		node.address=null;
		
		
		if(isEmpty()) {
			head=node;
			tail=node;
			
		}else {
			tail.address=node;
			tail=node;
		}
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			//System.out.println("address of current node:"+temp);

			System.out.println("Data:"+temp.data);
			//System.out.println("Address:"+temp.address);
			//System.out.println("------");
			temp=temp.address;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public Integer remove() {
		Integer value=null;
		if(!isEmpty()) {
			size--;
			Node temp=head;
			value=head.data;
			head=head.address;
			temp.address=null;
			temp=null;
			
			
		}
		return value;
		
	}
	public int size() {
		return size;
	}
	public Integer remove(int index) {
		Integer value=null;
		if(index >=0 && index<size && !isEmpty()) {
			
			Node temp=head;
			value=head.data;
			head=head.address;
			temp.address=null;
			temp=null;
			
			
		}
		return value;
	}
	}
		
	


