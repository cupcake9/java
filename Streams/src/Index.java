
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.ReadableByteChannel;  
import java.nio.channels.WritableByteChannel;  
 public class Index {  
    public static void main(String args[]) throws IOException {  
    FileInputStream input = new FileInputStream ("D:/friends/kbc.exe"); // Path of Input text file  
        ReadableByteChannel source = input.getChannel();  
    FileOutputStream output = new FileOutputStream ("D:/friends/kbc2.exe"); // Path of Output text file  
    long startTime = System.currentTimeMillis();    
    WritableByteChannel destination = output.getChannel();  
  copyData(source, destination);  
  System.out.println("Time:" + (System.currentTimeMillis() - startTime));
  source.close();  
  
        destination.close();  
        input.close();
        output.close();
    }  
 private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException   
    {  
        ByteBuffer buffer = ByteBuffer.allocateDirect(25 * 1024);  
   while (src.read(buffer) != -1)   
        {  
            // The buffer is used to drained  
            buffer.flip();  
            // keep sure that buffer was fully drained  
            while (buffer.hasRemaining())   
            {  
                dest.write(buffer);  
            }  
            buffer.clear(); // Now the buffer is empty, ready for the filling  
        }  
    }  
}  