// import java.util.*;

public class M7 {
    public static void main(String[] args){

        //you can call methods without including the class name given they were made in the same class

        int maximum = M7.max(1, 2);
        System.out.println(maximum);

        int number = M7.addition(10, 10);
        System.out.println(number);

        double triangle = M7.pythagorean(10, 20);
        System.out.println(triangle);

        welcome();      //void method

        String statement = "Hi";        //void method with parameter
        returnStatement(statement);

        // method conventions
        // can only have letters, numbers,  $ and _
        // first character cannot be a number
        // cant be reserved keyword
        // camelCase
        // verbNoun (getNumber) (setPrice)

        // access modifiers set the scope/accessability of the method
        // public methods can be used in any class
        // private methods can only be used in the same class it was created 

        // non access modifiers will tell you how its used
        // static, final, abstract, etc
        // static means it will be used with the name of a class, not an object
        // you can also use void if it doesnt return

        
    }

    //modifier non access modifier variable type function name (parameters, parameters){}
    public static int max(int num1, int num2){      //header

        if(num1 > num2){
            return num1;
        }else if(num2 > num1){
            return num2;
        }else{
            return 0;
        }
    }

    public static int addition(int in1, int in2){
        return in1 + in2;
    }

    public static double pythagorean(double a, double b){
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    //void example
    public static void welcome(){
        System.out.println("Hello");
        System.out.println("Welcome to my program");
    }

    //void with parameters
    public static void returnStatement(String Statement){
        System.out.println(Statement);
    }

}