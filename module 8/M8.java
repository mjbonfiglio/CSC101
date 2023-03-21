import java.util.*;

class M8{
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        char balls = 'H';
        char balls2 = 'h';
        //double quotes are for strings, single are for chars
        //ascii is only 7 bits of information (128 different things)
        System.out.println(balls + balls2);

        System.out.println((int)'a');
        System.out.println((char)65);

        //THERE IS NO nextChar(), use nextLine() or next();

        String input;
        System.out.println("Enter letter: ");
        input = k.next();
        char letter = input.charAt(0); //index from the string the char is getting

        //charAt
        String name = "John";

        for(int i = 0; i < name.length(); i++){
            letter = name.charAt(i);
            System.out.println(letter);
        }

        // str1.charAt(1) – pulls a char from a string
        // str1.contains(str2) – returns true if str2 is found in str1
        // str1.indexOf(str2) – returns index of where str2 is in str1
        // str1.substring(1, 4) – extracts a substring from the string
        // str1.trim() – removes leading and trailing spaces
        // str1.replaceAll(“a”, “e”) – replaces all a’s with e’s
        // str1.isEmpty() – returns true if length() is 0
        // str1.equals(str2) – returns true if str1 = str2
        // str1.compareTo(str2) - returns a numeric value indicating likeness (0 = the same)
        //str1.equalsIgnoreCase(str2) - returns true if equal


        //wrapper classes
        //Character "wraps" the char to make it usable in a method
        //this is a static method because its called with the class!
        char chr = 'A';
        Character.toLowerCase(chr);
        // Character.toUpperCase(‘x’)
        // Character.toLowerCase(‘x’)
        // Character.isUpperCase(‘x’)
        // Character.isLowerCase(‘x’)
        // Character.isDigit(‘x’)
        // Character.isWhitespace(‘x’)

        // String asdf = "asdf1234";
        // int number = asdf.parseInt(asdf);        //throws numberFormatException
        // System.out.println(number);

        //immutable things
        //strings are immutable, they cannot change, you can just change where it looks in the heap
        //string builder class
        StringBuilder text = new StringBuilder("Hello");
        System.out.println(text);
        text.append("B");
        System.out.println(text);
        text.insert(0, 'A');
        System.out.println(text);



        //regular expressions
        //(Regex)
        //it is a string of text used for matching patterns
        String origText = "I am a cat";
        String modText = origText.replaceAll("[aAeEiIoOuU]", "@");
        System.out.println(modText);

        String origText2 = "I am a cat";

        System.out.println(origText.matches(origText2));
        
        //this pattern will work with a string with a starting letter as x or X, then a number 0-9, then a letter a-z, then the number 1 or 5
        String pattern = "[xX][0-9][a-z][15]";
        //putting a carrot will mean "everything except this"
        //[^0-9] - 1-9

        String g = "Grey";

        if(g == "Gr[ae]y"){ //check if they entered Gray or Grey
            System.out.println("true");
        }

        //quantifiers
        String phonePattern = "[0-9]{10}";  //you need atleast 10 digits 0-9
        phonePattern = "[0-9]{3}-[0-9]{3}-[0-9]{4}"; //valid phone number
        String phoneNumber = "585-794-1824";
        if(phoneNumber.matches(phonePattern)){
            System.out.println(phoneNumber + " is Valid");
        }

        //valid emails
        String emailPattern = "[0-9-a-zA-Z]+@[0-9-a-zA-Z]+[\\.][0-9-a-zA-Z]";

        //boolean operators
        String bol = "[AZ|AB&AC]";

        System.out.println("Enter time: ");
        String time = k.nextLine();

         //first char must be 0-2, second must be 1-4, third must be 0-5, last must be 0-9
        if(time.matches("(1[0-2]|0[1-4]):([0-5][0-9])"));


    }
}