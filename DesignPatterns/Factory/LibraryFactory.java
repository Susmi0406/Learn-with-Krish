public class LibraryFactory {
    public Library getbook(String bookType) {

        Library library = null;
        
        if ("newsPaper".equals(bookType)){
            library = new NewsPaper();
        }
        else if ("storyBook".equals(bookType)){
            library = new StoryBook();
        }
        else if ("scienceBook".equals(bookType)){
            library = new ScienceBook();
        }
        else if ("religionBook".equals(bookType)){
            library = new ReligionBook();
        }
        return library;
    }
    
}
