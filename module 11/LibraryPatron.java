/**
            An instance of this class represents a lbrary patrons account information 
            @author Matt Bonfiglio
         */

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
    /**Creates new library patron with empty parameters */
    public LibraryPatron(){
        this("Name", 0, 0, 0);
        patronCounter++;
    }

    //a way to establish a completely new patron with a name and ID via overloading the method
    /**
     * 
     * @param word the first and last name of patron
     * @param code the ID for the patron
     */
    public LibraryPatron(String word, int code){
        this(word, code, 0, 0);
        patronCounter++;
    }

    //constructor for creating a patron with all 4 items custom
    /**
     * 
     * @param word first and last name
     * @param code patron ID
     * @param rented num of books rented
     * @param fee double for fees
     */
    public LibraryPatron(String word, int code, int rented, double fee){
        this.setName(name);
        this.setId(code);
        this.setRented(rented);
        this.setBill(fee);
        patronCounter++;
    
    }

    //getters to stop people from having direct access to data
    /**
     * 
     * @return the name of the patron
     */
    public String getName(){
        return name;
    }
    
    /**
     * 
     * @return the patrons id
     */
    public int getId(){
        return id;
    }

    /**
     * 
     * @return num of rented books
     */
    public int getRented(){
        return booksRented;
    }

    public double getBill(){
        return fees;
    }


    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setRented(int booksRented){
        this.booksRented = booksRented;
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
               "\nFees owed: " + fees;
    }

    //object methods 
    //clones a patron in a new patron object
    /**
     * 
     * @param person input patron object
     * @return the identical patron object
     */
    public LibraryPatron clone(LibraryPatron person){
        LibraryPatron person2 = new LibraryPatron();
        person2.setName(person.name);
        person2.setBill(person.fees);
        person2.setId(person.id);
        person2.setRented(person.booksRented);
        return person2;
    }

    //passing object in method and using the this keyword
    //method that combines 2 accounts
    public LibraryPatron combine(LibraryPatron account){
        LibraryPatron person = new LibraryPatron();
        String newName = this.name;
        int newId = this.id;
        int newBooks = this.booksRented;
        double newFees = this.fees;
        //etc
        return person;
    }

    //equals method
    public boolean PatronEquals(LibraryPatron libPat){
        if(this.getBill() == libPat.getBill() && this.getId() == libPat.getId() && this.getName() == libPat.getName() && this.getRented() == libPat.getRented()){
            return true;
        }else{
            return false;
        }
    }

    //static combine method
    //if its static the object wont call the method, the class will
    public static LibraryPatron combine(LibraryPatron p1, LibraryPatron p2){
        LibraryPatron patron3 = p1.combine(p2); //we dont have a combine method we havent made one but it works
        return patron3;
    }
}
