package Practice2;

public class P18 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println("Division by 0 is not possible!");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println(e.getCause());
        }
        System.out.println("1");
    }
}
