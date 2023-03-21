//Matt Bonfiglio
// This program will allow the user to dictate the size of an array and then fill it with integers, 
// both negative and positive. You will then determine how many of the integers in the array are even 
// and odd, as well as how many are positive and negative. (Count 0 as positive.) Four more arrays will 
// be required to store the values from these categories - evens, odds, positives and negatives. All 
// count data will be printed, followed by the actual values from each category.


import java.util.*;

class CounterMB {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);   //scanner/variables
        boolean error = true;
        int arrLength = 0;
        int positive = 0;
        int negative = 0;
        int even = 0;
        int odd = 0;
        
        System.out.println("Welcome, this program will count how many even/odd/positive/negative numbers you have in an array!");
        
        while(error){   //while there is an error
            try{
                System.out.print("Enter array length: ");
                arrLength = key.nextInt();  //try to get main array length
                if(arrLength < 1){  //if the array length is invalid throw exception
                    throw new Exception("You entered an invalid number!");
                }
                error = false;
            }catch(InputMismatchException e){   //print error type
                System.out.println("You did not enter an integer!");
                key.next();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        int list[] = new int[arrLength];    //create main array, the exact length specified


        for(int i = 0; i < arrLength; i++){ //for each possible index of the array
            error = true;
            while(error){   //while there is an error
                try{
                    System.out.print("Enter #" + (i + 1) + ": ");   //try to get integer to store in nth index
                    int userEntry = key.nextInt();
                    list[i] = userEntry;
                    error = false;
                }catch(InputMismatchException e){   //print error
                    System.out.println("You did not enter an integer!");
                    key.next();
                }
            }
        }

        for(int x : list){  //check if even or odd and count even and odd numbers
            if(x % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        for(int y : list){  //check and count positive/negative
            if(y > -1){
                    positive++;
            }else{
                negative++;
            }
        }
        
        int indexEven = 0;
        int indexOdd = 0;
        int indexPositive = 0;  //create index tallys for each sub array
        int indexNegative = 0;

        int[] evenArr = new int[even];
        int[] oddArr = new int[odd];    //create 4 sub arrays of exact length necessary
        int[] positiveArr = new int[positive];
        int[] negativeArr = new int[negative];

        for(int x : list){
            if(x % 2 == 0){
                evenArr[indexEven] = x; //add int to array depending on what type it is and increase index
                indexEven++;
            }else{
                oddArr[indexOdd] = x;
                indexOdd++;
            }
        }

        for(int x : list){  //add item from main array to pos/neg array
            if(x > -1){ 
                positiveArr[indexPositive] = x;
                indexPositive++;
            }else{
                negativeArr[indexNegative] = x;
                indexNegative++;
            }
        }


        //display results
        System.out.println("There is " + positive + " Positive integer(s) in the list: ");
        for(int x : positiveArr){
            System.out.print(x + "  ");
        }

        System.out.println("\nThere is " + negative + " Negative integer(s) in the list: ");
        for(int x : negativeArr){
            System.out.print(x + "  ");
        }

        System.out.println("\nThere is " + even + " Even integer(s) in the list: ");
        for(int x : evenArr){
            System.out.print(x + "  ");
        }

        System.out.println("\nThere is " + odd + " Odd integer(s) in the list: ");
        for(int x : oddArr){
            System.out.print(x + "  ");
        }

    }
}