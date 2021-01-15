package code;

import java.io.File;

public class OrdnerInhaltAusgebenMain {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File file :listOfFiles){
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}