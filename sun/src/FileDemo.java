import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) {
		FileWriter writer=null;
		try {
			System.out.println("wrirting the data to file");
	    writer=new FileWriter("one txt",true);
		writer.write("i love writing programming");
		writer.write("welcome to java programming");
		writer.write(". Its simple");
		
		System.out.println(" i wanted to wrirting the data to file");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.flush();
				writer.close();
			}catch(IOException e) {
				e.printStackTrace();
				}
		}
		// TODO Auto-generated method stub

	}

}
