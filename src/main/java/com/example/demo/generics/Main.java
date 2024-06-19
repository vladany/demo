package com.example.demo.generics;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {1.5,2.6,3.7,4.8};
        Character[] charArray = {'A','2',3,4}; // this ' anstelle von das "

        auslesen(charArray);
        auslesen(intArray);
        auslesen(doubleArray);
    }

    public static <Type> void auslesen(Type[] typeArray) { // Type ist stellvertretend für alle datentypen
        for (Type t: typeArray) { // durchsucht wird typeArray, t ausgabe
            System.out.println(t);
        }
    }

}
