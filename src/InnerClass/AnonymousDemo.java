package InnerClass;

class Bclass {
    public void show(){
        System.out.println("In B Show :");
    }
}

 /*class  Cclass extends Bclass {
    public void show(){
        System.out.println("In C Show :");
    }
}*/
public class AnonymousDemo {
    public static void main(String[] args) {

        Bclass bobj = new Bclass(){
            public void show(){
                System.out.println("In new Show :");
            }
        };
        bobj.show();

    }
}
