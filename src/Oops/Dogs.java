package Oops;

public   class Dogs extends Animals{
    int leg;

    Dogs(int i) throws CloneNotSupportedException {
        this.leg=i;
        System.out.println("I am in dog cons!!!"+leg);
    }

    public  void hasLegs(){
        super.hasLegs();
        System.out.println("Dog has 4 legs");
    }

    public void sound(){
        super.hasLegs();
        System.out.println("Dog sound woofs");
    }

    public static void  main(String[] args) throws CloneNotSupportedException {

      //  Animals a= new Animals();

        Dogs d = new Dogs(4);
/*

        d.sound();

        //d.eating();
        d.hasLegs();
        System.out.println("Animal obeject ");
      */
/*  a.eating();
        a.sound();
        a.hasLegs();*/


    }
}
