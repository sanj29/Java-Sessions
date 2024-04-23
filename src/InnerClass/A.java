package InnerClass;

public class A {

    public void show(){

        System.out.println("In A Show :");
    }
     class B {
        public void showB(){
            System.out.println("In B Show :");
        }
    }

    static class  C {
        public void showC(){
            System.out.println("In C Show :");
        }
    }

    public static void main(String[] args) {

        A obj = new A();

        obj.show();
        // TO Access B method have to create object
        A.B ob = obj.new B(); // if inner class is not static
        ob.showB();

       A.C oc = new C();

       oc.showC();
    }
}
