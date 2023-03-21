import java.util.*;
import java.text.*;

class m2 {
   public static void main(String[] args) {
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
         
         //buffer is a space between an input and output device, the scanner checks the buffer
         // first and if there is items in the buffer itll wait for a user to input something
         //this is like a cpp input stream
         Scanner k = new Scanner(System.in);
         System.out.println("Enter 2 words: " );
         String uinput1 = k.next();   //this takes one of the words and stores the other in the buffer. 
         String uinput2 = k.next();    //this takes the next word from the buffer and stores it.
         System.out.println(uinput1 + uinput2);
         
         //.nextLine() gets up to and including the return key, so any time you have .next, .nextInt(), or 
         //.nextDouble() they will leave behind a return key, so nextLine() will grab nothing.
         System.out.println("Enter a number, then a sentence: ");
         int uinput3 = k.nextInt();
         String uinput4 = k.nextLine();                        //this doesnt do it but trust me bro
         System.out.println(uinput3 + " " + uinput4);
         
         k.nextLine();  //including this will clear the buffer incase you have other issues   THIS IS LITERALLY CPP
         
         System.out.println("Enter 2 words: ");
         String ui1 = k.next();
         String ui2 = k.next();
         System.out.println(ui1 + ui2);
         
         System.out.println("Enter 2 words: ");
         ui1 = k.next();
         k.nextLine();
         ui1 = k.next();
         System.out.println(ui1);
         
         //CONSTANTS
         //variables that will not change 
         final int DAYS_IN_YEAR = 365;
         final double STATE_TAX = .08;
         final String GREETING = "hello";
         //DAYS_IN_YEAR = 100;  this will throw an erorr and not let the program run
         
         //double area = Math.PI * Math.pow(10,2); < dumb, stupid
         //final double area = Math.PI * Math.pow(10,2) < awesome, cool
         
         double bigNumber = 2.3E33 / 10;
         double smallNumber = 2.9E-19;
         System.out.println(bigNumber);
         
         //random class
         Random randomGen = new Random();
         int number = randomGen.nextInt(100);   //generate anything from 0-99
         System.out.println(number);
         number = randomGen.nextInt(10, 100); // 10-99
         
         
         DecimalFormat twoPlaces = new DecimalFormat("0.00");
         DecimalFormat fourPlaces = new DecimalFormat("0.0000");
         System.out.println(twoPlaces.format(bigNumber));
         
         //static and instance
         //static- a method that is called with the name of the class >> the MATH class (class)    >>Dog.getFood()
         //instance- one that is called with an object >> the deciamlformat class (object)         >>dog.feed()
         
         //object types vs primitive types
         //primitive - raw pieces of data, like int
         //object- created from another class, some are string, scanner, decimalformat, and random
         //string is a container of characters in essence, its many char objects stuck together
         //with primitive data types the actual value is stored under the value
         //with an object, the type is stored in an address that refers to where the object is stored in memory,
         //a string that says hi is declared as a string first and then the compiler is directed to where in the memory that data is stored
         //primitive objects are stored in the stack
         //object types are stored in the heap, and are just kinda in there
         //2 areas of memory, the stack and the heap, are reserved for your program
         
         //the stack memory holds the address for objects, and the compiler is told where in the heap memory the data for that object is stored
         //
         
    
   
   }
}