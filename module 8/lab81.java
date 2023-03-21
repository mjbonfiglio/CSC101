import java.util.*;

class Lab8Part1 {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        System.out.print("Enter Any text and I will flip flop it!: ");
        String input = key.nextLine();

        String modified = input.replaceAll(" ", "-");

        for(int i = 0; i < input.length(); i++){

            char letter = input.charAt(i);

            if(Character.isUpperCase(letter)){
                modified = modified.replace(letter, Character.toLowerCase(letter));
            }else{
                modified = modified.replace(letter, Character.toUpperCase(letter));
            }
        }
        System.out.println(modified);
    }
}
