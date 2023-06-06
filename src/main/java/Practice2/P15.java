package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean loop = true;
        while (loop){
            try{
                System.out.println("Please enter the value");
                num = scan.nextInt();
                loop = false;

            }catch (InputMismatchException a){
                System.out.println("Invalid Input!");
                scan.nextLine();

            }
        }
        System.out.println("Congrats, you can enter numbers. The entered number is: "+num);
    }
}
