public class WordDocument
{
    private long id;
    private String title;
    private String heading;
    private String description;
      
    public WordDocument(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }
           
    public WordDocumentMemento createMemento()
    {
        WordDocumentMemento d = new WordDocumentMemento(id, title, heading, description);
        return d;
    }
      
    public void restore(WordDocumentMemento d) {
        this.id = d.getId();
        this.title = d.getTitle();
        this.heading = d.getHeading();
        this.description = d.getDescription();
    }
  
    @Override
    public String toString() {
        return "Word Document[id=" + id + ", title=" + title + ", heading="+ heading +", description=" + description + "]";
    }

    public void setContent(String string) {
    }
}
