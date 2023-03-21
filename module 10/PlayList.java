import java.util.*;

class PlayList {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);

        Song[] playList = new Song[5];

        playList[0] = new Song();
        playList[1] = new Song("Meat Grinder", "MF DOOM");
        playList[2] = new Song("IFHY", "Tyler, the Creator");
        playList[3] = new Song("alright", "Kendrick Lamar", 2015, 2.7);
        playList[4] = new Song("DNA", "Kendrick Lamar", 2018, 3.1);

        System.out.print("Enter Song title: ");
        String title = key.nextLine();

        System.out.print("Enter Artist: ");
        String artist = key.nextLine();

        System.out.print("Enter Song Year: ");
        int year = key.nextInt();

        System.out.print("Enter Song Length: ");
        double length = key.nextDouble();

        playList[0].setTitle(title);
        playList[0].setArtist(artist);
        playList[0].setYear(year);
        playList[0].setLength(length);

        for(int i = 0; i < playList.length; i++){
            String gTitle = playList[i].getTitle();
            String gArtist = playList[i].getArtist();
            int gYear = playList[i].getYear();
            double gLength = playList[i].getLength();

            System.out.println("<---------------->");
            System.out.println("Song Title: " + gTitle);
            System.out.println("Song Artist: " + gArtist);
            System.out.println("Song Year: " + gYear);
            System.out.println("Song Length: " + gLength);
        }

        for(Song song : playList){
            System.out.println(song.toString());
        }
   

    }
}
