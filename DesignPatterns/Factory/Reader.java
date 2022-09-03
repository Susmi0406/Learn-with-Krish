public class Reader {
    public static void main(String[] args) {
        LibraryFactory libraryFactory = new LibraryFactory();
        Library library = null;
        String findBook = null;
        
        library = libraryFactory.getbook("newsPaper");

        System.out.println("Book Type: " + library.getClass().getName());
           findBook = library.bookType();
           System.out.println("News Papers: " + findBook);
           System.out.println();

           library = libraryFactory.getbook("storyBook");

           System.out.println("Book Type: " + library.getClass().getName());
              findBook = library.bookType();
              System.out.println("Story Books: " + findBook);
              System.out.println();

              library = libraryFactory.getbook("scienceBook");

         System.out.println("Book Type: " + library.getClass().getName());
           findBook = library.bookType();
           System.out.println("Science Books: " + findBook);
           System.out.println();

           library = libraryFactory.getbook("religionBook");

        System.out.println("Book Type: " + library.getClass().getName());
           findBook = library.bookType();
           System.out.println("Religion Books: " + findBook);
           System.out.println();
            
    }
    
}
