package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Student {

    int rollNum;
    String name, address;

    public Student(int rollNum, String Name, String address){

        this.rollNum=rollNum;
        this.name =Name;
        this.address = address;
    }

    public  String toString(){

        return this.rollNum + " " + this.name + " "
                + this.address;
    }

    public void displayStudent(){

        System.out.println("Name ::" + name);
        System.out.println("Roll ::" + rollNum);
        System.out.println("Address ::" + address);
    }

    static class SortByName implements Comparator <Student>{
        @Override
        public int compare(Student a, Student b) {

            return a.name.compareTo(b.name);
        }
    }

    static class SortByRoll implements Comparator <Student>{
        @Override
        public int compare(Student a, Student b) {
            if (a.rollNum >b.rollNum)
                return  1;
            else
                return -1;
        }
    }



}
