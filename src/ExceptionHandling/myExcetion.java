package ExceptionHandling;

public class myExcetion extends Exception{

    public static  void go() throws myExcetion {

        System.out.println("I am in my exception class !!");
        throw  new myExcetion();
    }
}
