import java.util.*;

class MathPractice{
   public static void main(String[] args){
   
      System.out.println(Math.max(2, 3) + Math.floor(1.99));
   
      Scanner k = new Scanner(System.in);
      
      System.out.println("Welcome!");
      System.out.println("Please enter 2 doubles individually: ");
      
      double input1 = k.nextDouble();
      double input2 = k.nextDouble();
      
      double sum = input1 + input2;
      double product = input1 * input2;
      
      double largest = Math.max(input1, input2);
      double smallest = Math.min(input1, input2);
      
      double power = Math.pow(largest, smallest);
      double sqrt = Math.sqrt(Math.abs(largest));
      
      double ceil1 = Math.ceil(input1);
      double ceil2 = Math.ceil(input2);
      int sumCeil = (int)ceil1 + (int)ceil2;
      
      double difference1 = input2 - input1;
      double difference2 = input1 - input2;
      double smallestdiff = Math.min(difference1, difference2);
      
      System.out.println("-------------------------------------------------------");
      
      System.out.println(input1 + " + " + input2 + " = " + sum);
      System.out.println(input1 + " * " + input2 + " = " + product);
      System.out.println("Largest input: " + largest + "\nSmallest input: " + smallest);
      System.out.println(largest + " ^ " + smallest + " = " + power);
      System.out.println("The square root of |" + largest + "| = " + sqrt);
      System.out.println("Input 1 rounded up: " + (int)ceil1 + "\nInput2 rounded up: " + (int)ceil2);
      System.out.println((int)ceil1 + " + " + (int)ceil2 + " = " + sumCeil);
      System.out.println(input2 + " - " + input1 + " = " + difference1);
      System.out.println(input1 + " - " + input2 + " = " + difference2);
      System.out.println("Smallest of the differences: " + smallestdiff);
      
      
      
      
      
   }
}