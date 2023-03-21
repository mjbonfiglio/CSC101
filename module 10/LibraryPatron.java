/*
 info for patron:
    name
    id
    books rented
    if they have fees
    their fees
 */

 //the only thing in this file that runs in sequential order is the contents of each method, other than that you could hav
 //all of this in a random folder

class LibraryPatron {

    //data members
    public String name; //patrons name
    public int id;  //patrons id
    public int booksRented; //patrons currently rented books
    public double fees; //patrons fees

    //no arg constructor
    //this is the basic template for a library patron
    //the constructors all have an increment for the number of patrons 
    public LibraryPatron(){
        name = "person";
        id = 999999;
        booksRented = 0;
        fees = 0;
        patronCounter++;
    }

    //a way to establish a completely new patron with a name and ID via overloading the method
    public LibraryPatron(String word, int code){
        name = word;
        id = code;
        booksRented = 0;
        fees = 0;
        patronCounter++;
    }

    public LibraryPatron(String word, int code, int rented, double code3){
        name = word;
        id = code;
        booksRented = rented;
        fees = code3;
        patronCounter++;
    
    }

    //getters to stop people from having direct access to data
    public String getName(){
        return name;
    }
    
    public int getId(){
        return id;
    }

    public int getRented(){
        return booksRented;
    }

    public double getBill(){
        return fees;
    }


    //setters
    public void setName(String word){
        name = word;
    }

    public void setId(int code){
        id = code;
    }

    public void setRented(int rented){
        booksRented = rented;
    }

    public void setBill(double bill){
        fees = bill;
    }


    //check out books, int argumnet
    public void checkOutBooks(int number){
        booksRented += number;
    }
    //return books, int argument
    public void returnBooks(int number){
        booksRented -= number;
    }
    //increase fees
    public void increaseFee(double number){
        fees += number;
    }
    //decrease fee
    public void decreaseFee(double number){
        fees -= number;
    }

    
    //static variables anc constants
    public static int patronCounter = 0;


    //tostring
    public String toString() {
        return "<------------------->" + 
               "\nName: " + name + 
               "\nID: " + id + 
               "\nBooks Rented: " + booksRented + 
               "\nFees owed: " + fees + 
               "\n<------------------->";
    }

    //test main()
    public static void main(String[] args){
        LibraryPatron p1 = new LibraryPatron("Matt", 10);
        System.out.println(p1);

        LibraryPatron p2 = new LibraryPatron("Joe", 3, 5, 12.75);
        System.out.println(p2);
    }
}
