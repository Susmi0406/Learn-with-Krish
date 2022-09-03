public class ChainOfResponsibility {
    public static void main( String[] args )
 {
 Kasun kasun = new Kasun();
  
 System.out.println("\n ---Paid Amount 1965----\n");
  
 kasun.payment(1965);
  
 System.out.println("\n ---Paid Amount 3005----\n");
  
 kasun.payment(3005);
 }
}
