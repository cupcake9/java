import java.io.FileInputStream;

public class FileInputDemo {

	public static void main(String[] args) throws Exception {
		String file = "D:/friends/song.txt";
		FileInputStream istream = new FileInputStream(file);
		//array of the size of available bytes in stream
		byte[] bar =new byte[istream.available()];
		istream.read(bar); //reading stream data into byte array
		String content = new String(bar);  //converting byte array to string
		System.out.println(content);
		
		
		
		
	//	int ch = 0;
		
		//while (true) {
			//ch = istream.read();
			//if (ch == -1)
				//break;
			//System.out.print((char)ch);
		//}
		istream.close();
	}

}
