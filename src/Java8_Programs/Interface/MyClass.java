package Java8_Programs.Interface;
interface myInterface{
    default boolean equalss(Object o){ // we can not use Default keyword here as equals method of Object class can not be overridden

        return o.equals(true);
    }
    public static void show(){
        System.out.println("In myInterface Show method");
    }
}
public class MyClass implements myInterface{

    public static void main(String[] args) {
        myInterface.show();
        MyClass c = new MyClass();
        System.out.println(c.equalss(false));
    }
}
