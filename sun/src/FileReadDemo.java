import java.io.FileReader;

public class FileReadDemo {

	

	public static void main(String[] args)throws Exception {
		FileReader reader=new FileReader("one txt");
		int number=0;
		while((number=reader.read())!=-1) {
			System.out.println((char) number);
			
				}
		reader.close();
		
	}

}
