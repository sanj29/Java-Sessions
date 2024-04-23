package Oops;

public class Overloading {


    final int PI= 3;


    public int Area(int r){
        int area=PI*r*r;
        System.out.println("Area of a circle is:: "+area);
        return area;
    }

    public int Area(int l, int breath){
        System.out.println("Area of a triangle is:: "+l*breath);
        return l*breath;
    }

    public int Area(int h, int base,String str){
        System.out.println("Area of a triangle is:: "+(base*h)/2);
        return (base*h)/2;
    }

    public static void main(String[] args) {
        int r =10;
        int l =10;
        int base=3;
        int h=10;
        int breath=5;

        Overloading ovr= new Overloading();

        float a = ovr.Area(h,base,"");
        int rect=ovr.Area(l,breath);
        int cir=ovr.Area(r);

    }
}
