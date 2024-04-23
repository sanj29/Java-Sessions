package Threads;

class  A extends  Thread{

    public void run(){
        for(int i=0; i <50; i++)
            System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class  B  extends  Thread{

    public void run(){
        for(int i=0; i <50; i++)
            System.out.println("Hello");try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {


        A obj1 = new A();
        B obj2 = new B();

        System.out.println(obj1.getPriority());
        System.out.println(obj1.getName());
       // obj1.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        Thread.sleep(1);
        obj2.start();
    }
}
