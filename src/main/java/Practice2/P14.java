package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P14 {
    public static void main(String[] args) {
        String path = "C:\\Users\\mutee\\IdeaProjects\\Software\\Files\\Employees1.xlsx";
        try{
            FileInputStream fileinput = new FileInputStream(path);
        }catch (FileNotFoundException a){
            System.out.println("The file you are trying to read is not found.");

        }
        System.out.println("Hey");

    }
}
