package Practice2;

public class InsufficientBalance extends RuntimeException{

    public InsufficientBalance(String errorMsg) {
        super(errorMsg);
    }
}
