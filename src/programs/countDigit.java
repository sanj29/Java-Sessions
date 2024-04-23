package programs;

public class countDigit {

    public static void main(String[] args) {
        System.out.println(countDigits(-123456));

    }

    public static  int countDigits(int num){
        int count=0;
        while(num>0){
            num =num/10;
            count++;
        }
        return count;
    }

}
