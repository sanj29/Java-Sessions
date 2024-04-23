import java.io.*;
import java.util.*;

public class Dependancy {


/*
 * Click `Run` to execute the snippet below!
 */



/* tasks = { 'a' : [ 'b', 'c' ],
             'b' : [ 'c', 'd'],
             'c' : [ 'd', 'e' ],
             'd' : [ ],
             'e' : [ ]
             }

'd', 'e', 'c','b','a' */
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


    public static void main(String[] args) {

        //List<HashMap<String,List<String>>> ls = new  ArrayList<>();


        Map<String, List<String>> task = new HashMap<>();

        task.put("a",Arrays.asList("b","c"));

        task.put("b",Arrays.asList("c","d"));
        task.put("c",Arrays.asList("d","e"));
        task.put("d",Arrays.asList());
        task.put("e",Arrays.asList());

        //TreeMap<String, String> tm = new TreeMap<>(task);

        System.out.println(task);
        int len=0;
        //    int i =0;
        List<String>  answer = new ArrayList<>();

        for (int i =0 ; i< task.size() ; i++){
            for(Map.Entry<String, List<String>> es : task.entrySet())
            {
  /*      if (es.getValue().size() == 0)
        {
          if(!answer.contains(es.getKey()))
              answer.add(es.getKey());
        }
        else
        {
*/    if (answer.containsAll(es.getValue()))
            {
                if(!answer.contains(es.getKey()))
                    answer.add(es.getKey());
            }
            }
        }

/*         for(int i=0 ; i <es.getValue().size(); i++ ){
          if (es.getValue().get(i).equals(""))
            System.out.println(es.getKey());
          else{
                if(es.getValue().get(i).contains(es.getKey()))
                 depval=depval+es.getKey();
          }

        }
  */

        System.out.println(answer);
    }
}


// Your previous Plain Text content is preserved below:

// This is just a simple shared plaintext pad, with no execution capabilities.

// When you know what language you'd like to use for your interview,
// simply choose it from the dots menu on the tab, or add a new language
// tab using the Languages button on the left.

// You can also change the default language your pads are created with
// in your account settings: https://app.coderpad.io/settings

// Enjoy your interview!
