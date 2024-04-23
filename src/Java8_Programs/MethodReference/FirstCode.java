package Java8_Programs.MethodReference;

interface Parser{
    String parser(String str);
}

class  StringParser {
    public static String convert(String s) {

        if (s.length() <= 3)
            s = s.toUpperCase();
        else
            s = s.toLowerCase();
        return s;
    }
}
    class MyPrinter{
        public void print(String str, Parser p){
            str = p.parser(str);
            System.out.println(str);
        }
    }
    public class FirstCode {
        public static void main(String[] args) {
            String str = "sa";
            String str1 = "saNjay";
            MyPrinter mp = new MyPrinter();
            mp.print(str, (String s) -> StringParser.convert(s)); // with lambda
            mp.print(str1, StringParser::convert); // with method reference

        }
    }
