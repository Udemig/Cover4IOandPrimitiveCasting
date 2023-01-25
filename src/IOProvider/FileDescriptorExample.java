package IOProvider;

import common.Constants;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorExample {
    public void write(){
        FileDescriptor fileDescriptor = null;
        byte[] bytes = {83,59,91,68,79,63};
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(Constants.FILES_PATH +"/people.txt");
            fileDescriptor = fileOutputStream.getFD();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
            fileDescriptor.sync();

            System.out.println("basarili sekilde calistir");
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        try{
            FileInputStream fileInputStream = new FileInputStream(Constants.FILES_PATH +"/people.txt");
            int value = 0;
            while ((value = fileInputStream.read()) != -1){
                char c = (char) value;
                System.out.println(c);
            }
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
