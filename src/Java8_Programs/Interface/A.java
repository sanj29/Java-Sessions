package Java8_Programs.Interface;

public class A extends  C implements I{

    public static void main(String[] args) {

        A a  =new A();
        a.myShow(); // myShow() method on Class C will be called as Class is more powerful than Interface
    }
}
