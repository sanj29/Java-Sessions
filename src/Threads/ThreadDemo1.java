package Threads;

/*class  Aa implements  Runnable{

    public void run(){
        for(int i=0; i <50; i++)
            System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}*/

class  Bb  implements  Runnable{

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDemo1 {

    public static void main(String[] args) throws InterruptedException {


        Runnable obj1 = () ->{
                for(int i=0; i <50; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        Runnable obj2 = new Bb();
        Thread t1= new Thread(obj1);
        Thread t2= new Thread(obj2);

        System.out.println(t1.getPriority());
        System.out.println(t1
                .getName());
        // obj1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        Thread.sleep(1);
        t2.start();
    }
}
