// class hello {
//     public static void main(String args[])
//     {
//         System.out.print("Hello World");
//     }
// }

    // Varriable and Data Types
 // explanation of which is varriable and data types

// class hello {
//     public static void main(String args[]){
//         int container = 10;
//         String john = "J";
//         String container2 = "Gobal";
//         System.out.println(container);
//         System.out.println(john);
//         System.out.println(container2);
//     }
// }

        // add the promgram

import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[]){
        // int a = 10;
        // int b = 20;
        // int c = 30;
        //           // int contianer = a + b + c;
        // int container;
        // container  = a + b + c;
        // System.out.println(container);  

        // int myNum = 5; 
        // myNum = 10;
        // System.out.println(myNum);


                // final varriable
                // ஏற்கெனவே myNum-க்கு 15 என்ற மதிப்பைக் கொடுத்துவிட்டோம்.ஆனால் final பயன்படுத்தியிருப்பதால், அதன் மதிப்பை 20 என்று மாற்ற முயற்சிக்க முடியாது.அதனால் Java Compilation Error கொடுக்கும்.

        // final int myNum = 15;
        // myNum = 20; 
        // system.out.println(myNum);    


                // Print Varriable 
        // String name = "John";
        // System.out.println("Welcome " + name);

                // Multiple Varriable
        // int a , b , c;
        // a= b= c= 100;
        // System.out.println(a + b + c);


        // Data Types
        // you cannot change the type like example
         
        //  int myNum = 5; // Integer (whole number)
        //  myNum = "hello";
        // System.out.println(myNum);

        // Byte and Short
        //  byte myNum = 105;
        //  System.out.println(myNum);

        // short myNum = 5000;
        // System.out.println(myNum);


        // user Int
        Scanner Peter = new Scanner(System.in);
        int a = Peter.nextInt();
        int b = Peter.nextInt();
        System.out.println(a + b);
    }
}