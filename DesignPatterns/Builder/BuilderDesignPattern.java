public class BuilderDesignPattern {
    public static void main(String[] args) {
 
        Juice orange = ShopKeeper.takeOrder("orange");
        System.out.println(orange);
 
        Juice apple = ShopKeeper.takeOrder("apple");
        System.out.println(apple);
    }
}