import java.io.*;
import java.util.*;

class lab12 {
    public static void main(String[] args) throws IOException{

        final String FILE1_NAME = "text.txt";
        final String FILE2_NAME = "text2.txt";

        File file1 = new File(FILE1_NAME);
        File file2 = new File(FILE2_NAME);

        file2.createNewFile();

        Scanner read = new Scanner(file1);
        Scanner read2 = new Scanner(file2);
        PrintWriter writer = new PrintWriter(file2);

        String[] strArray = new String[10];

        

        for(int i = 0; i < 10; i++){
            strArray[i] = read.next();
            writer.println(strArray[i].length());
        }

        writer.close();

        for(String str : strArray){
            System.out.println(str + " - " + read2.nextInt());
        }
    }
}
