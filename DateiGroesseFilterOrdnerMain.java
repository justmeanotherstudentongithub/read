package code;

import java.io.File;

public class DateiGroesseFilterOrdnerMain {
    public static void main(String[] args) {
        double size = 50000;
        String path = "C:\\SOWAustausch";
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File file : listOfFiles){
            if (file.isFile() && file.length() > size) {
                System.out.println(file.getName());
            }
            if (file.isDirectory()){
                // System.out.println(file.getAbsolutePath());

                path = file.getAbsolutePath();
                File directOut = new File(path);
                File[] outofDirectory = directOut.listFiles();
                assert outofDirectory != null;
                for (File file1 : outofDirectory){
                    if (file1.length() > size){
                        System.out.println(file1.getName());
                    }
                }
            }
        }
    }
}