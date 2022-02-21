

public class ProdConsDemo {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Producer p=new Producer(factory);
		Consumer c=new Consumer(factory);
	}
	
		// TODO Auto-generated method s
}
class  Factory{
	int  value=0;
	boolean status=false;
	public synchronized void create() {
		while(status) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		
				}		
		value++;
		System.out.println("value created is:"+value);
		status= true;
		notify();
		
	}
	public synchronized void remove() {
		while(!status) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			value++;
			System.out.println("value created is:"+value);
			status= false;
			
			notify();
		}
		
		
	}
	
}
class Producer implements Runnable{
	Factory factory;
	
	public Producer(Factory factory) {
		this.factory =factory;
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		for (int i = 1; i < 11; i++) {
			factory.create();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			
			
		}
	}
	
	
	
}
class Consumer  implements Runnable{
	Factory factory;
	public Consumer(Factory factory) {
		this.factory=factory;
		Thread th =new Thread(this);
		th.start();
	}
	public void run() {
		for (int i = 1; i < 11; i++) {
			factory.remove();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				// TODO: handle exception
			}
			}
		}
}
	

