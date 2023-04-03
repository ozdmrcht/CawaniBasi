package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
     Car obj1=new Car("reflection", "dirty","nice");
        System.out.println(obj1.mirror +" "+ obj1.door +" "+ obj1.mat);


    }
}