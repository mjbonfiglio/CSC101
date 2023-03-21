import java.util.*;

class M9 {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        
        int arrayList[] = new int[100];   //create and initialize array list
                                          //upon creating an array you cannot change the size of the array
                                          //printing an unassigned index will print 0 or null depending on array object type

        arrayList[0] = 1;
        arrayList[1] = 10;
        arrayList[2] = 100;     //adding ints to array
        arrayList[3] = 1000;
        arrayList[4] = 10000;

        int[] count = {1, 2, 3, 4, 5, 6};   //this is also an array thats easier to inititalize if you know how many items you have

        System.out.println(arrayList[0]);   //print array

        for(int i = 0; i < 5; i++){     //loop through array and print i'th item
            System.out.println(arrayList[i]);
        }



        String inputs[] = new String[10];

        for(int i = 0; i < 2; i++){
            System.out.print("Enter String: "); //loop to get inputs for strings
            inputs[i] = key.nextLine();
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println(inputs[i]);  //print inputs out
        }

        //array.length is a CONSTANT and does not need ()
        String[] epicList = new String[100];
        System.out.println(epicList.length);

        for(int i = 0; i < epicList.length; i++){
            epicList[i] = "Baller";
            System.out.println(epicList[i]);
        }

        boolean[] binary = new boolean[100];

        for(int i = 0; i < binary.length; i++){
            if((i + 1) % 2 == 0){
                binary[i] = true;
            }else{
                binary[i] = false;
            }
            System.out.println("Index " + i + ": " + binary[i]);
        }




        System.out.print("Enter how many apples you have: ");
        int size = key.nextInt();
        double[] apples = new double[size];

        for(int i = 0; i < apples.length; i++){
            System.out.println("Enter apple weight: " );
            apples[i] = key.nextDouble();
        }
        

        //for each loop     SUS?!
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (String day : daysOfWeek) {
            System.out.println(day);
        }


        //array for method
        double[] inputArray = new double[10];
        for(int i = 0; i < inputArray.length; i++){ //create array of doubles 0-19
            inputArray[i] = i;
        }
        double sum = sumOfNums(inputArray); //call array in the sum function
        System.out.println(sum);
        

        //method to create new array
        int[] newArray = createArray(100);


        //updating arrays in methods without returning it
        int[] arr = {1, 2, 3};
        for (int i : arr) {
            System.out.println(i);
        }
        changeArr(arr, 10, 20, 30);
        for (int i : arr) {
            System.out.println(i);
        }



        //multidimentional arrays
        int rows = 10;
        int columns = 10;
        int twoDArr[][] = new int[columns][rows];

        for(int i = 0; i < 10; i++){
            System.out.print("Row " + i + ": ");
            for(int e = 0; e < 10; e++){
                twoDArr[i][e] = e;
                System.out.print(twoDArr[i][e]);
            }
            System.out.println("\n");
        }

        int[][] twoDArr2 = {{1,2,3}, {2,3,4}};


        //variable sized rows
        String[][]words = {{"hello", "Hi", "Good evening"}, {"The", "Best"}};
        for(int i = 0; i < words.length; i++){
            for(int e = 0; e < words[i].length; e++){
                System.out.print(words[i][e] + " ");
            }
        }


        //create a pyramid
        int pyramid[][] = new int[4][];
        for(int i = 0; i < pyramid.length; i++){
            System.out.println("\n");
            for(int e = 0; e < pyramid[i].length; e++){
                pyramid[i][e] = 1;
                System.out.println(pyramid[i][e]);
            }
        }
        //this creates the rows for the columns like:
        /* 
         * 
         * *
         * * *
         * * * *
         etc
        */


 
    }





    //method to sum items in array
    public static double sumOfNums(double[] inputArray){
        double total = 0;
        for(int i = 0; i < inputArray.length; i++){
            total += inputArray[i];
        }
        return total;
    }




    //method to create and return a new array
    public static int[] createArray(int size){
        int[] newArray = new int[size];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = i;
        }
        return newArray;
    }




    public static void changeArr(int[] arr, int inp1, int inp2, int inp3){
        arr[0] = inp1;
        arr[1] = inp2;
        arr[2] = inp3;
    }
}
