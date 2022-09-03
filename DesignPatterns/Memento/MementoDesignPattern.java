public class MementoDesignPattern
{
    public static void main(String[] args)
    {
        WordDocument document = new WordDocument(1, "My Article");
        document.setContent("ABC");    
        System.out.println(document);
          
        WordDocumentMemento memento = document.createMemento(); 
          
        document.setContent("XYZ");      
        System.out.println(document);
          
        document.restore(memento);       
        System.out.println(document);    
    }
}