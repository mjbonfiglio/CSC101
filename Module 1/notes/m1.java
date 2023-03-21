//module 1

//header comment
/*Name: Matt Bonfiglio
This program is the module 1 notes */

import java.util.Scanner;  //only import the scanner class
import java.util.*;  //this will make the compiler look for literally any class from the util package thats needed to satisfy the compilers needs

class m1{   //create a class (container) all code will be in
   public static void main(String[] args){   //this is the main function that will house your code
   System.out.print("Hello, World!"); //this will print and then also go down a line after
   System.out.println("Hello, World!"); //this will print on a line
   
   System.out.println("Text");
   System.out.println(""); //blank line
   System.out.println("Text");
   
   System.out.println("123" + "321");   //will connect strings together (Strings)
   System.out.println(123 + 321);   //will add numbers together (integers)
   System.out.println("123" + 123); //will concat them like 2 strings
   System.out.println(123 + 123 + "123"); // will add together then concat string onto end
   System.out.println(1 + 2 + 3 + "!!!" + 3 + 2 +1);
   
   //primitive data types
   byte a = 8;
   short b = 16;
   int c = 32;
   long d = 64;
   
   //float e = 3.2;
   double f = 6.40000;
   
   //char 
   //boolean
   
   System.out.println(a);  //these variables can be printed
   
   //declare    new name and data
   String str = new String("Hello!");  //objects are slightly different
   System.out.println(str);
   
   String one = new String("Hello, "); 
   String two = new String("World!");
   System.out.println(one + two);   //strings can be concatted

   String three = "hello";   //you also can literally do this
   System.out.println(three);
   
   //methods
   System.out.println(three.length()); //.length()
   int theLength = three.length();
   System.out.println(theLength);
   
   String text = new String("Text");   //.indexOf()
   int location = text.indexOf("World");
   System.out.println(location);
   
   String st = new String("Hello world"); //.substring()
   String word = st.substring(0,5);
   String wordTwo = st.substring(9);
   System.out.println(word + " " + wordTwo);
   
   /*
   this
   is 
   a 
   comment 
   */
   
   //input
   //you must import the scanner class first (see imports)
   //the scanner class with the name keyboard, you can name it anything but the object type is just scanner
   Scanner keyboard = new Scanner(System.in);   //in the method system.in is the system input device which is the keyboard by default
   
   /* scanner methods
   .next- gets the first word from the keyboard
   .nextLine()- get the entire thing they type before they enter it
   .nextInt()- will look for an integer in the string they entered
   .nextDouble()- looks for next bouble
   String str =  keyboard.next();   takes first word user entered and store in str
   */
   System.out.println("Enter your name: ");
   String name = keyboard.nextLine();  //saves the input in the string name
   System.out.println(name);
   System.out.print("enter your age: ");
   int age = keyboard.nextInt();
   System.out.println(age + 10);
   
   //arithmetic
   int num = 10;
   int num2 = num + 1 - 1 * 1 / 1;
   
   //double num = 1;   this is more precise than int num = 1; this is just 1.0
   //you cannot do 4 * 2.5, so itll implicitly convert all ints to doubles, so its 4.0 * 2.5\
   //dividing 2 integers will give you the whole number with no remainder
   //% sign will only give the remainder
   //5 % 2 will be 2 remainder of 1 so 5 % 2 = 1
   
   //implicit typecasting
   //37 + 1 = 38 (int + int = int)
   System.out.print("enter an integer: ");
   int int1 = keyboard.nextInt();
   System.out.print("enter an integer: ");
   int int2 = keyboard.nextInt();
   double arith = int1 / int2;   //this wont treat them like doubles
   double arithDouble = (double)int1/int2; //this treats only int1 as a double thus it makes int2 a double. this does NOT change the original variable to a double
   
   //the math class
   //you do not need to create a math object, just import the class library. its all methods
   System.out.println(Math.sqrt(4));   //square root
   System.out.println(Math.pow(5,2));   //5^2: Math.pow(base, exponent)
   System.out.println(Math.max(10, 20));  //largest of the 2 numbers \
   System.out.println(Math.min(10, 20));  //smalled of the 2 numbers / both of these are limited to 2 imputs 
   System.out.println(Math.abs(-25));  //absolute value method
   //you cannot just pass a double into the .round method, it will not compile. only float to int, or double to long
   float flo1 = 2.3f;   //the f on the end will identify it as a float, otherwise the compiler will think its a double
   int round1 = Math.round(flo1);
   System.out.println(round1);
   System.out.println(Math.ceil(2.1));  //takes value to next highest whole number
   System.out.println(Math.floor(2.1)); //takes value to next lowest whole number
   //trig expressions are input in radians
   System.out.println(Math.sin(Math.PI / 4));   //sin function using the PI constant in the math class
   
   //shorthand operators
   Scanner scan = new Scanner(System.in);
   int counter = 0;
   
   System.out.println("Enter name: ");
   String str4 = scan.nextLine();
   counter+= 1;
   //or counter++;
   int cum = 10;
   cum += 100;
   cum *= 10;
   cum /= 10;
   
   //escape sequences
   /*    
         \t - tab
         \n - new line
         \" - print a double quote
         \\ - print a back slash
   */
   
   System.out.println("\tHello, World!\nMy name is \"Matthew Bonfiglio\"\\\"Matt Bonfiglio\" if we're friends.");
   
   
   }
}