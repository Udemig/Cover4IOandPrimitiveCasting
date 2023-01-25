package IOProvider;


import common.Constants;

import java.io.*;

public class StringWriterReader {

    public void write(){
        char[] ary = new char[512];
        try{
            StringWriter writer = new StringWriter();
            FileInputStream input = new FileInputStream(Constants.PERSON_FILE_PATH);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));
            int i;
            while ((i=buffer.read(ary)) != -1){
                writer.write(ary,0,i);
            }
            System.out.println(writer.toString());
            writer.close();
            buffer.close();
        } catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void read(){
        String content = "Merhaba ben icte olan bir metinim";
        StringReader reader = new StringReader(content);
        int i = 0;
        try{
            while ((i=reader.read()) != -1){
                System.out.println((char) i);
            }
        }catch (IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

}
