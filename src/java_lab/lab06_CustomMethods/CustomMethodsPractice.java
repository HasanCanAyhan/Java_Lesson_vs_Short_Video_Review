package java_lab.lab06_CustomMethods;

public class CustomMethodsPractice { // Question 1 - 5

    public static void main(String[] args) {

    /*
    SYNTAX :
    Access-Modifier   Specifier    Return-Type    Method-Name (Parameters) {

            Code Fragmants that can perform the task         Parameters: Additional info that the method must have
    }
     */

        System.out.println(helloName("Bob"));// Question 1:
        System.out.println("------------------------------------");
        System.out.println(makeAbba("Hi","Bye"));// Question 2
        System.out.println("------------------------------------");
        System.out.println(extraEnd("Hello"));// Question 3
        System.out.println("------------------------------------");
        System.out.println(firstTwo(" ")); // Question 4
        System.out.println("------------------------------------");
        System.out.println(withoutEnd("coding")); // Question 5






    }
    public static String helloName(String name){

        return "Hello " + name + "!";

        // return command : 1) return the value 2) exit the mehod

    }  // Question 1

    public static  String makeAbba(String str1, String str2){

        return str1+str2+str2+str1;

        /*
        or:

        String result = "";
        result += str1;
        result += str2;
        result += str2;
        result += str1;
        return result;
         */

    }  // Question 2

    public static String extraEnd(String str){

        if (str.length() < 2){
            return "Invalid";
        }

        str = str.substring(str.length() -2);

        str = str.repeat(3);

        return str;
    } // Question 3

    public static String firstTwo(String str){

        if(str.length() < 2){
            return str;
        }


        return str =  str.substring(0,2);

        // or : return ""+ str.charAt(0) + str.charAt(1);

    } // Question 4


    public static String withoutEnd(String str){

        if (str.length() <= 2){
            return "Invalid";
        }

        return str = str.substring(1,str.length() -1);


    } // Question 5







}
/*
 1.

Create a method that accepts 1 string, e.g. "Bob", return a greeting of the form "Hello
Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"

2.
Create a method that accepts two strings, a and b, return the result of putting them
together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"


3.
Create a method return a new string made of 3 copies of the last 2 chars of the original
string. The string length will be at least 3.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

4.
Given a string, return the string made of its first two chars, so the String "Hello" yields
"He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and
the empty string "" yields the empty string "".

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

5.
Given a string, return a version without the first and last char, so "Hello" yields "ell". The
string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"


 */
