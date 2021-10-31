package exceptions.task1;

public class Task1 {
    public static void main(String[] args) throws CannotDivideBy0Exception{
        MathUtils.divide(10, 0);
        }

    }



class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception(){
        super("Can't divide by 0!");
    }
}


class MathUtils{
    public static float divide(int a, int b) throws CannotDivideBy0Exception{
        if (b == 0){
            throw new CannotDivideBy0Exception();
        }
        return a/b;
    }

}