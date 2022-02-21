import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class SerializableDemo {

	public static void main(String[] args)throws Exception {
		Employee2 emp=new Employee2("Rakesh",1000,30000);
		
		FileOutputStream fos = new  FileOutputStream("emp.ser");
		ObjectOutputStream oos = new  ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		// TODO Auto-generated method stub

	}

}
