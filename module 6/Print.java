import java.util.*;

class Print{
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("This program will print a letter of your choice as much as you ask for!");

        int iter = 1;
        boolean error = true;
        int repeat = 1;


        while(repeat == 1){
            while(error){

                try{
                    System.out.print("Enter the iterations between 1 and 100, or enter 0 to end program: ");
                    iter = key.nextInt();

                    if(iter < 0){
                        throw new Exception("You entered a number lower than 0!");
                    }else if(iter > 100){
                        throw new Exception("You entered a number greater than 100!");
                    }

                    if(iter != 0){

                        System.out.print("Enter letter to print: ");
                        String letter = key.next();
                        key.nextLine();

                        for(int i = 0; i < iter; i++){
                            System.out.print(letter + " ");
                        }

                    }else{
                        repeat = 0;
                        System.out.println("Thank you.");
                    }

                    error = false;

                }catch(InputMismatchException e){
                    System.out.println("You did not enter an integer!");
                    key.nextLine();
                }catch(Exception e){
                    System.out.println(e.getMessage());
                    key.nextLine();
                }
            }

            error = true;
        }


}
}   