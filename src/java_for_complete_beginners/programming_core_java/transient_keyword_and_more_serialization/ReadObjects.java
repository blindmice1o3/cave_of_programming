package java_for_complete_beginners.programming_core_java.transient_keyword_and_more_serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try(ObjectInputStream os = new ObjectInputStream( new FileInputStream("test.ser") )) {
            //try(FileInputStream fs = new FileInputStream("test.ser"); ObjectInputStream os = new ObjectInputStream(fs)) {
            Person person = (Person)os.readObject();
            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
