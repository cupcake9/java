import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.Buffer;

public class FileCopyDemo {

	public static void main(String[] args) throws Exception {
		BufferedInputStream istream = new BufferedInputStream(new FileInputStream("D:/friends/kbc.exe"));
		BufferedOutputStream ostream = new BufferedOutputStream(new FileOutputStream("D:/friends/kbc2.exe"));
		long startTime = System.currentTimeMillis();
		int ch = 0;
		while (true) {
			ch = istream.read();
			if (ch == -1)
				break;
			ostream.write(ch);
		}
		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
		ostream.close();
		istream.close();
	}

}
