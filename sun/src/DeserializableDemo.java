import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class DeserializableDemo {

	public static void main(String[] args)throws Exception {
		FileInputStream fis = new  FileInputStream("emp.ser");
		ObjectInputStream ois = new  ObjectInputStream(fis);
		Employee2 obj=(Employee2) ois.readObject();
		System.out.println(obj.getName());
		System.out.println(obj.getId());
		System.out.println(obj.getSalary());



	}

}
