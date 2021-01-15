package code;

import java.io.File;

public class DateigroesseMain {
    public static void main(String[] args) {
        File dateiname = new File("C:\\Users\\");
        if (dateiname.exists()){
            double groesseinBytes = dateiname.length();
            System.out.println(groesseinBytes);

        }
    }
}
