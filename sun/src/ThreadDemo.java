
public class ThreadDemo {

	public static void main(String[] args) {
		MyMath  math=new  MyMath();
		//System.out.println(math.getThreadGroup());
		//math.setPriority(Thread.MAX_PRIORITY);
		//math.setName("Incrementing Thread");
		math.start();
		System.out.println("program excuted");
		
		// TODO Auto-generated method stub

	}

	
}
class MyMath extends Thread{
	public void run() {
		print();
	}



	public void print() {
		System.out.println(this.getPriority());
		for (int i = 1; i < 11; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(this.getName()+":"+i);
				
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			} 
			
		}
		}
	}
	

