public class Kasun {
    private static FiveHundredRupeesHandler fivehundredRupeesHandler = new FiveHundredRupeesHandler();
 private static HundredRupeesHandler hundredRupeesHandler = new HundredRupeesHandler();
 private static FiftyRupeesHandler   fiftyRupeesHandler   = new FiftyRupeesHandler();
 private static TwentyRupeesHandler  twentyRupeesHandler  = new TwentyRupeesHandler();
 private static FiveRupeesHandler    fiveRupeesHandler    = new FiveRupeesHandler();
 
 static
 {
 // Construct the chain of Rupees Handlers
 fivehundredRupeesHandler.nextHandler(hundredRupeesHandler);
 hundredRupeesHandler.nextHandler(fiftyRupeesHandler);
 fiftyRupeesHandler.nextHandler(twentyRupeesHandler);
 twentyRupeesHandler.nextHandler(fiveRupeesHandler);
 }
 
 public void payment( long givenAmount )
 {
 
 fivehundredRupeesHandler.fetchRupees(givenAmount);
 }
}
