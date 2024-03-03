package ge.sdsu.session20240302.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) throws FileNotFoundException {

        String relativePath = "src/main/java/ge/sdsu/session20240302/files/example.txt";
        File file = new File(relativePath);

        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNext()){
                System.out.println(scanner.next());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

//        Scanner scanner = new Scanner(file);


    }
}
