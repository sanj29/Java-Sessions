package Java8_Programs.Lambda;

@FunctionalInterface
interface  A {
    void show();
}

public class DemoFuncInterfaceTest {

    public static void main(String[] args) {

        // implementation of in show method without lambda
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In Show");
            }
        };

        // implementation of in show method with lambda
        A obj1 = () -> System.out.println("In Show  with lambda");
        obj.show();
        obj1.show();
    }
}
