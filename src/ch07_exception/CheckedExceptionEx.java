package ch07_exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx {
    public void readFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("README.md"));
            String line = br.readLine();
            System.out.println(line);
            br.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
