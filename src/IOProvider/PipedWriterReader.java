package IOProvider;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterReader {
    private PipedReader read = new PipedReader();
    private PipedWriter write = null;


    public void write(){
        try{
            write = new PipedWriter(read);
            write.write("Merhaba ben PipedWriter kisiyim".toCharArray());
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            int data = read.read();
            while (data != -1){
                System.out.println((char) data);
                data = read.read();
            }
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
