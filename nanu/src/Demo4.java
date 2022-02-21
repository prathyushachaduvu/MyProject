import java.util.Stack;
public class Demo4 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.add(40);
		stack.add(50);
		System.out.println(stack);
		//stack.remove(30);
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		// TODO Auto-generated method stub

	}

}
