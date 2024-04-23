package Java8_Programs.Interface;

public interface I {

    default void show(){
        System.out.println("i am on interface I Show method");
    }


    default void myShow(){
        System.out.println("i am on interface I MyShow method");
    }
    int sum(int a, int b);

}
