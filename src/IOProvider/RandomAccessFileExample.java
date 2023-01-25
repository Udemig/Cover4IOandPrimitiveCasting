package IOProvider;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    public void read(String filePath, int position, int size){
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "r");
            randomAccessFile.seek(position);
            byte[] bytes = new byte[size];
            randomAccessFile.read(bytes);
            randomAccessFile.close();
            System.out.println("bytes " + bytes);
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public  void write(String filePath, String data, int position){
        try {
            RandomAccessFile file = new RandomAccessFile(filePath,"rw");
            file.seek(position);
            file.write(data.getBytes());
            file.close();
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
