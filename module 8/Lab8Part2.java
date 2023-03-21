import java.util.*;

class Lab8Part2{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter a string, I will convert it to morse code: ");
        String input = key.nextLine();
        StringBuilder modified = new StringBuilder();

        for(int i = 0; i < input.length(); i++){ 
            modified.append(getMorse(input.charAt(i)) + " ");
        }

        System.out.println(modified);


    }

    public static String getMorse(char letter){
        letter = Character.toLowerCase(letter);

        switch(letter){
            case 'a':
                return "._";
            case 'b':
                return "_...";
            case 'c':
                return "_._.";
            case 'd':
                return "_..";
            case 'e':
                return ".";
            case 'f':
                return ".._.";
            case 'g':
                return "__.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".___";
            case 'k':
                return "_._";
            case 'l':
                return "._..";
            case 'm':
                return "__";
            case 'n':
                return "_.";
            case 'o':
                return "___";
            case 'p':
                return ".__.";
            case 'q':
                return "__._";
            case 'r':
                return "._.";
            case 's':
                return "...";
            case 't':
                return "_";
            case 'u':
                return ".._";
            case 'v':
                return "..._";
            case 'w':
                return ".__";
            case 'x':
                return "_.._";
            case 'y':
                return "_.__";
            case 'z':
                return "__..";
            case '.':
                return "._._._";
            case ',':
                return "__..__";
            case '?':
                return "..__..";
            case '/':
                return "_.._.";
            case '@':
                return ".__._.";
            case '1':
                return ".____";
            case '2':
                return "..___";
            case '3':
                return "...__";
            case '4':
                return "...._";
            case '5':
                return ".....";
            case '6':
                return "_....";
            case '7':
                return "__...";
            case '8':
                return "___..";
            case '9':
                return "____.";
            case '0':
                return "_____";
            case ' ':
                return "  ";
            default:
                return "";
        }
    }
}