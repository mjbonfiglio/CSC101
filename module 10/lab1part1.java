class Song {
   
   private String title;   //private members of function
   private String artist;
   private int year;
   private double length;

   public Song(){    //no arg constructor
      title = "Happy birthday";
      artist = "Matt Bonfiglio";
      year = 2003;
      length = .25;
   }

   public Song(String cTitle, String cArtist){ //2 arg constructor (title, artist)
      title = cTitle;
      artist = cArtist;
      year = 2000;
      length = 2.0;
   }

   public Song(String cTitle, String cArtist, int cYear, double cLength){  //4 arg constructor (title, artist, year, length)
      title = cTitle;
      artist = cArtist;
      year = cYear;
      length = cLength;
   }

   //getters
   public String getTitle(){  //return title
      return title;
   }

   public String getArtist(){ //return artist
      return artist;
   }

   public int getYear(){   //return year
      return year;
   }

   public double getLength(){ //return length
      return length;
   }

   //setters
   public void setTitle(String sTitle){   //set title
      title = sTitle;   
   }

   public void setArtist(String sArtist){ //set artist
      artist = sArtist;
   }

   public void setYear(int sYear){     //set year
      year = sYear;
   }

   public void setLength(double sLength){    //set length
      length = sLength;
   }

   public String toString() {
      return "<------------------->" + 
             "\nTitle: " + title + 
             "\nArtist: " + artist + 
             "\nYear: " + year + 
             "\nLength in minutes: " + length;
  }

   
}