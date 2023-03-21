class StringInfo{
   public static void main(String[] args){
   
      //variable declarations
      String quote = new String("Heavy is the head that eats the crayon.");
      int quoteLen = quote.length();
      int quoteSpace =  quote.indexOf(" ");
      String firstFive = new String(quote.substring(0, 5));
      String lastFive = new String(quote.substring(quoteLen - 5));
      
      //print statements
      System.out.println("The quote: " + quote);
      System.out.println("The length of the quote is: " + quoteLen + " characters.");
      System.out.println("The first space is at index " + quoteSpace);
      System.out.println("The first five characters are: " + firstFive);
      System.out.println("The last five characters are: " + lastFive);
   
   }
}