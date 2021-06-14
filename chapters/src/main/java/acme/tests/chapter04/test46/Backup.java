package acme.tests.chapter04.test46;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Backup {
    public void performBackup() {
        try {
            throw new IOException("Disk not found");  // z1
        } catch (Exception e) {
            try {
                throw new FileNotFoundException("File not found");
            } catch (FileNotFoundException e2) {       // z2
                System.out.print("Failed");
            }
        }
    }
    public static void main(String... files) {
        new Backup().performBackup();                // z2
    }
}
