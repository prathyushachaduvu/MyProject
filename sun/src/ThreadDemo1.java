
public class ThreadDemo1 {

	public static void main(String[] args) {
		Test t =new Test();
		Thread th = new Thread(t);
		th.start();
		System.out.println("program excuted");
		// TODO Auto-generated method stub

	}

}
class Test implements Runnable{
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}