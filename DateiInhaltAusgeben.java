package code;

import java.io.FileReader;
import java.io.IOException;

public class DateiInhaltAusgeben {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:\\Users\\"); // Datei angeben
        char[] vorgang = new char[1028]; // max länge
        int count = 0;
        while (count + reader.read(vorgang) >= 0){
            System.out.print(vorgang);
        }

    }
}
