package Java8_Programs.Interface;

public class C implements I,J{

    @Override
    public void show(){ // Here C has to define/override as show method is present in I n J interace
        System.out.println("I am in C class Show method");
        I.super.show();

    }

    public void myShow(){
        System.out.println("I class C myShow methos");
    }
    @Override
    public int jSum(int a, int b) {
        return a+b;
    }

    @Override
    public int sum(int a, int b) {
    return a+b;
    }



    public static void main(String[] args) {

        C c=  new C();
        c.show();

        System.out.println(c.jSum(10,12));
        System.out.println(c.sum(3,4));

    }
}
