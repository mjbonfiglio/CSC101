class M11 { //jumping off the diving board
    public static void main(String[] args) {

        System.out.println("Test");

        LibraryPatron patron001 = new LibraryPatron();  //new patron

        System.out.println(patron001.name);
        System.out.println(patron001.id);
        System.out.println(patron001.fees);
        System.out.println(patron001.booksRented);

        //establish an address and save room for each of its variables 
        patron001.name = "John adams";
        patron001.id = 1;
        patron001.fees = 0;
        patron001.booksRented = 5;

        LibraryPatron patron002 = new LibraryPatron("John", 10);

        System.out.println(patron002.name); //this was established in the method
        System.out.println(patron002.id);   //this was established in the method
        System.out.println(patron002.name); //not established in the method

        //code established using the third librarypatron method via overloading
        LibraryPatron patron003 = new LibraryPatron("Jake", 10, 3, 0);

        //getting information using getters
        System.out.println(patron003.getName());
        System.out.println(patron003.getId());
        System.out.println(patron003.getRented());
        System.out.println(patron003.getBill());

        //creating information using setters
        System.out.println(patron003.name);
        patron003.setName("Bob");
        System.out.println(patron003.name);

        //printing out tostring
        System.out.println(patron003.toString());
        //if it exists you can implicitly call it
        System.out.println(patron003);

        patron003.increaseFee(10.3);
        patron003.checkOutBooks(12);
        System.out.println(patron003);

        //printing the number of patrons by accessing the static int patronCounter
        System.out.println(LibraryPatron.patronCounter);


        //arrays with patrons
        LibraryPatron[] patrons = new LibraryPatron[5]; //this only creates the array, it doesnt make any patrons

        patrons[0] = new LibraryPatron();   //basic constructor
        patrons[1] = new LibraryPatron("Matt", 10); //2 parameter contstructor
        patrons[2] = new LibraryPatron("Matt", 10, 4, 10.25); //4 parameter constructor

        for(LibraryPatron patron: patrons){
            System.out.println(patron);
        }

        LibraryPatron patron004 = new LibraryPatron();
        LibraryPatron patron005 = new LibraryPatron();

        LibraryPatron patron045 = patron004.combine(patron005);

        // LibraryPatron patron006 = clone(patron001);
        // System.out.println("Patron 6\n" + patron006.toString());



        //this is a word to refer to the current object
        //you want to use this.xxx() because you can reference the method for a setter with special parameters in it
        //you can use only one constructor 
        //encapsulation is the idea of creating a class with private data that is wrapped in public methods
        //this whole program is encapsulation
        //another is inheritance, polymorphism, and abstraction



        //more instance/static methods
        //equals method (instance)
        System.out.println(patron001.PatronEquals(patron001));
        System.out.println(patron001.PatronEquals(patron002));

        
        
    }
}
