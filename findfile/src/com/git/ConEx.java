package com.git;

/**
 * Created by tmurphy on 08/12/2016.
 */
public class ConEx {

    double weight = 2.5;
    double height = 3;
    String name = "Tom";
    int age = 33;
/*
    public ConEx(double weight, double height, String name, int age) {
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.age = age;
    }*/
    public static void Me(){

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My height is "+height);
        System.out.println("My weight is "+weight);
    }
}
