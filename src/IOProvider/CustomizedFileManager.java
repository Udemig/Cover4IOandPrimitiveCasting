package IOProvider;

import common.Constants;

import java.io.File;
import java.io.IOException;

public class CustomizedFileManager {
    private File file= null;
    private File parentFile;
    public void createFile(){
        try{
             file = new File(Constants.FILES_PATH + "/people.txt");
             parentFile  = new File(Constants.FILES_PATH);
            if (file.createNewFile()){
                System.out.println("yeni dosya olsuturuldu");
            } else {
                System.out.println("dosya zaten var");
            }
        } catch(IOException e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void fileExists(){
        if (file.exists()){
            System.out.println("Boyle bi dosya kesinlikle var");
        } else {
            System.out.println("Boyle bir dosyamiz yoktur");
        }
    }

    public void getPath(){
        System.out.println(file.getAbsolutePath());
    }

    public void listFiles(){
        String filenames[] = parentFile.list();
        // System.out.println(parentFile.list());
        for (String filename: filenames) {
             System.out.println(filename);
        }
    }

    public void checkFilePossibilities(){
        System.out.println(file.getName() + " " + file.canWrite() + " " + file.isHidden() + " " + file.length());
    }
}
