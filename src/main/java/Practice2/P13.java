package Practice2;

import java.sql.SQLOutput;

public class P13 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        try{
            System.out.println(10/0);
            int[] array = new int[-1];
        }
        catch (Exception e) {
            System.out.println("A");
        }

        System.out.println("6");
        System.out.println("7");
    }
}
