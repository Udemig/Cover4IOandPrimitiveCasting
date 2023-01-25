import IOProvider.*;
import collections.ArrayListExample;
import common.Constants;

import java.io.FileDescriptor;
import java.io.PipedWriter;

public class Main {
    public static void main(String[] args) {

        /* String Writer
        StringWriterReader stringWriterReader = new StringWriterReader();
        //stringWriterReader.write();
        stringWriterReader.read();


        PipedWriterReader pipedWriterReader = new PipedWriterReader();
        pipedWriterReader.write();
        pipedWriterReader.read();
        CustomizedFileManager customizedFileManager = new CustomizedFileManager();
        customizedFileManager.createFile();
        customizedFileManager.fileExists();
        customizedFileManager.getPath();
        customizedFileManager.listFiles();
        customizedFileManager.checkFilePossibilities();

        FileDescriptorExample fileDescriptor = new FileDescriptorExample();
        fileDescriptor.write();
        fileDescriptor.read();

        RandomAccessFileExample randomAccessFileExample = new RandomAccessFileExample();
       // randomAccessFileExample.read(Constants.PERSON_FILE_PATH, 0,18);
        randomAccessFileExample.write(Constants.PERSON_FILE_PATH, "selam random 1", 10);
     */

        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.studentArrayList();
    }

}