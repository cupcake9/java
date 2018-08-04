
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class Copy {
	public static void main(String args[]) throws IOException {

		ReadableByteChannel source = new FileInputStream("D:/friends/kbc.exe").getChannel();
		WritableByteChannel destination = new FileOutputStream("D:/friends/kbc2.exe").getChannel();
		long startTime = System.currentTimeMillis();
		copyData(source, destination);
		System.out.println("Time:" + (System.currentTimeMillis() - startTime));
		source.close();
		destination.close();
	}

	private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
		ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
		while (src.read(buffer) != -1) {

			buffer.flip();

			while (buffer.hasRemaining()) {
				dest.write(buffer);
			}
			buffer.clear();
		}
	}
}