//matt bonfiglio
/*
 * this program will maintain an inventory of products for a company
 * the user can add a product
 */

import java.util.*;

class inventory {
    public static void main(String[] args){

        product[] productArray = new product[10];

        Scanner scan = new Scanner(System.in);  //scanners
        Scanner inputNewProd = new Scanner(System.in);

        int index = 0;  //variables
        boolean error = true;
        int entry = 0;
        int totalProductCount = 0;
        boolean empty = true;

        while(entry != 7){  //while user has not ended the program
            while(error) {
                printMenu();    //print the menu

                try{
                    System.out.print("Enter Here: ");   //try to get user input
                    entry = scan.nextInt();
                    System.out.println();

                    if(entry < 1 || entry > 7){ //if user entry invalid throw exception
                        throw new Exception("You did not enter a valid integer!");
                    }

                    error = false;

                }catch(InputMismatchException e){
                    System.out.println("You did not enter an Integer!");
                    scan.next();    //clear buffer
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }   //ends while(error) loop

            if(entry != 7){ //ends program
                error = true;
            }

            switch(entry){  //based on entry activate menu option
                case 1:
                    for(int x = 0; x < productArray.length; x++){
                        if(productArray[x] != null){    //if object exists
                            System.out.println((x + 1) + ". \n" + productArray[x].toString());  //print tostring()
                            empty = false;
                            
                        }
                    }
                    if(empty){
                        System.out.println("There are no products in your inventory!"); //tell user if array empty
                    }
                    error = true;   //ends while(error)
                    break;  //ends case 1

                case 2:

                    double iPrice = 0;
                    int iQuantity = 0;

                    if(hasRoom(productArray)){  //if the array has room

                        System.out.print("Enter Product Name: ");   //user input for name and description
                        String iName = inputNewProd.nextLine();
                        iName = iName.toLowerCase();    //make input lowercase
                        System.out.print("Enter Product Description: ");
                        String iDesc = inputNewProd.nextLine(); 

                        error = true;
                        while(error){   //try to get product price
                            try{
                                System.out.print("Enter Product Price: ");
                                iPrice = scan.nextDouble();
                                if(iPrice < 0){
                                    throw new Exception("Price must be non negative");
                                }
                                error = false;
                            }//ends try block
                            catch(InputMismatchException e){
                                System.out.println("You did not enter an integer!");
                                scan.next();
                            }catch(Exception e){
                                System.out.println(e.getMessage());
                            }
                        }   //ends try/catch

                        error = true;
                        while(error){   //try to get product quantity
                            try{
                                System.out.print("Enter Quantity Price: ");
                                iQuantity = scan.nextInt();
                                if(iQuantity < 0){
                                    throw new Exception("Quantity must be non negative");
                                }
                                error = false;
                            }//ends try block
                            catch(InputMismatchException e){    //enters non integer
                                System.out.println("You did not enter an integer!");
                                scan.next();
                            }catch(Exception e){    //enters num < 0
                                System.out.println(e.getMessage());
                            }
                        }   //ends try/catch

                        product newProd = new product(iName, iDesc, iPrice, iQuantity); //add new product to array
                        productArray[index] = newProd;
                        index++;    //


                    }   //ends if array has room

                    System.out.println("\nProduct successfully added to inventory.");   //confirmation
                    error = true;
                    break;  //ends case 2


                
                case 3:
                    System.out.print("Enter product name: ");   //input discount info
                    String inputName = inputNewProd.nextLine();
                    System.out.print("Enter Discount: ");
                    double discount = scan.nextDouble();
                    

                    for(product prod : productArray){   //for each item in array if item.getName() == input name apply discount
                        if(prod != null && prod.getName().equals(inputName)){
                            prod.applyDiscount(discount);
                        }
                    }      
                    break; //ends case 3
                case 4:
                    
                    System.out.println("The following products need reordering: ");

                    for(product prod : productArray){   //print out each product that needs ordering
                        if(prod != null && prod.needsOrdered() == true){
                            System.out.println(prod.toString());
                        }
                    }
                    break; //ends case 4
                
                case 5:
                    double total = 0;   
                    for(product prod : productArray){   //calculate total worth of inventory
                        if(prod != null) {total += prod.returnWorth();
                        }
                    }
                    System.out.println("Total worth of products is: $" + total);
                    break;  //ends case 5

                case 6:
                    System.out.println("Merging two duplicate entries: ");
                    for(int i = 0; i < productArray.length; i++){
                        if(productArray[i] != null){
                            System.out.println((i + 1) + ". " + productArray[i].getName()); //print each item in array 
                        }
                    }
                    System.out.print("Enter number of first product: ");    //get both inputs
                    int num1 = scan.nextInt();
                    System.out.print("Enter number of second product: ");
                    int num2 = scan.nextInt();

                    if(productArray[num1 - 1].equals(productArray[num2 - 1])){  //check if they are equal
                        product newProd = productArray[num1 - 1].combine(productArray[num2 - 1]);   //if equal combine them

                        productArray[num1 - 1] = newProd;   //set combined product to index of first product and remove second product from second index
                        productArray[num2 - 1] = null;
                    }else{
                        System.out.println("Thise products are not the same!");
                    }




                break;  //ends case 6
            }   //ends switch block
        }   //ends program continuation loop

        for(product prod : productArray){   //final message after ending program
            if(prod != null){
                System.out.println("Name: " + prod.getName() + ", Quantity: " + prod.getQuantity());    //print information for each item in array
                totalProductCount += prod.getQuantity();
            }
        }

        System.out.println("Total product count: " + totalProductCount);    //print total amount of items

    }   //ends main method block

    public static void printMenu() {    //method for printing the menu
        System.out.println();
        System.out.println("Product Inventory System");
        System.out.println("What would you like to do?");
        System.out.println("1. View Inventory");
        System.out.println("2. Add Product");
        System.out.println("3. Apply Discount to Product");
        System.out.println("4. Generate Reorder List");
        System.out.println("5. Get Total Worth");
        System.out.println("6. Merge Two Product Entries");
        System.out.println("7. Exit");
        System.out.println();
    }

    public static boolean hasRoom(product[] prodArr){   //method to check if the array has room to add another object
        for(product prod : prodArr){
            if(prod == null){
                return true;
            }
        }
        return false;
    }
}
