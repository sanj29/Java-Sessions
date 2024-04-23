package Hashmap;

import java.io.*;
import java.util.*;

    /*
     * To execute Java, please define "static void main" on a class
     * named Solution.
     *
     * If you need more classes, simply define them inline.
     */

    class Sorting {
        public static void main(String[] args) {

            //r =
            Map<String, String> map= new HashMap<>();
            String[] r = {"7: 'DV'", "5: 'A'", "2: 'BDD'","45: 'Y'", "11: 'BDE'"};
            for(int i =0 ; i <r.length; i++){
                map.put(r[i].split(":")[1],r[i].split(":")[0]);
            }

            TreeMap<String, String> tr = new TreeMap<>(map);
            Iterator itr = tr.keySet().iterator();

            while(itr.hasNext()){
                String k = (String) itr.next();
                System.out.print ( k + ":" +map.get(k)+" ");
            }






//r = {5: 'A', 2: 'BDD', 11: 'BDE', 7: 'DV', 45: 'Y}




        }
    }


// Your previous Plain Text content is preserved below:

// r = {7: 'DV', 5: 'A', 2: 'BDD',45: 'Y', 11: 'BDE'}

// output:

// r = {5: 'A', 2: 'BDD', 11: 'BDE', 7: 'DV', 45: 'Y}
