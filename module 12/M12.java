import java.io.*;
import java.util.*;

class M12 {
    public static void main(String[] args) {

        // File ioFile = new File("text.txt");
        // PrintWriter writer = new PrintWriter(ioFile);
        // Scanner read = new Scanner(ioFile);

        // writer.print("null");

        // writer.print("test");

        // writer.close();

        // csv file
        String sentence = "The best man";
        String[] sentenceArr = sentence.split(" ");
        for (String x : sentenceArr) {
            System.out.println(x);
        }

        File csvFil = new File("text.csv");
        PrintWriter writeToCsv = new PrintWriter(csvFil);

        writeToCsv.println("1,2,3");
        writeToCsv.println("4,5,6");
        writeToCsv.println("7,8,9");

        StringBuilder text = new StringBuilder();

        Scanner readCSV = new Scanner(csvFil);

        text.append(readCSV.nextLine());
        text.append(readCSV.nextLine());
        text.append(readCSV.nextLine());

    }
}