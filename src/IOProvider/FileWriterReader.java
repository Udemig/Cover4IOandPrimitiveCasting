package IOProvider;

import java.io.*;

public class FileWriterReader extends FileWriter {

    public FileWriterReader(String fileName) throws IOException {
        super(fileName);
    }


}

 class FileWriterReader2 extends FileReader{

     public FileWriterReader2(String fileName) throws FileNotFoundException {
        super(fileName);
    }


 }
