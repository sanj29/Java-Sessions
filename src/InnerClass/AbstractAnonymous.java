package InnerClass;

abstract  class  AB {

    public void show(){
        System.out.println("in A show");
    }
    abstract public void display();
}
public class AbstractAnonymous {


    public static void main(String[] args) {
        AB abObj = new AB(){ // Inner class implementation not creating object of AB class here.
            public void display(){
                System.out.println("my display method");
            }
        };

        abObj.display();
    }
}
