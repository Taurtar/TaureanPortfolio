import java.util.*;
class Main{
    public static void main(String[] args){
        //Objects
        Scanner console = new Scanner(System.in);
        ArrayList<String> input_author = new ArrayList<String>();
        Book book = new Book();
    
        //Book Characteristics//
        System.out.println("Enter book title: ");
        String input_title = console.nextLine();
        book.setTitle(input_title);//gets and sets book title
    
        boolean trigger = false;
        System.out.println("Enter the name of the auther(s). Type -9 to end");
        do{
            String input = console.nextLine();
            input_author.add(input);
            if(input.equals("-9")){
                input_author.remove("-9");
                trigger = true;
            }
        }while(trigger == false);
        book.setAuthor(input_author);//gets and sets book auther(s)
    
        System.out.println("Enter publisher of book: ");
        String input_publisher = console.nextLine();
        book.setPublisher(input_publisher);//gets and sets book publisher
    
        System.out.println("Enter book price: ");
        float input_price = console.nextFloat();
        book.setPrice(input_price);//gets and sets book price
    
        System.out.println("Enter number of book copies: ");
        int input_copies = console.nextInt();
        book.setCopies(input_copies);//gets and sets book copies
    
        console.close();//this isn't needed. VScode was yelling at me for not having this
    
        //Print book info
        System.out.println("Title: " + book.getTitle() + ", Author(s): " + book.getAuthor() + ", Publisher: " + book.getPublisher());
        System.out.println("Price: $" + book.getPrice() + ", Copies: " + book.getCopies());
    }
}
class Book{
    //global variables
    private String title = null;
    private ArrayList<String> author = new ArrayList<String>();
    private String publisher = null;
    private float price = 0;
    private int copies = 0;
    
    public void setTitle(String title){this.title = title;}
    
    public String getTitle(){return title;}
    
    public void setAuthor(ArrayList<String> auther){this.author = auther;}
    
    public ArrayList<String> getAuthor(){return author;}
    
    public void setPublisher(String publisher){this.publisher = publisher;}
    
    public String getPublisher(){return publisher;}
    
    public void setPrice(float price){this.price = price;}
    
    public float getPrice(){return price;}
    
    public void setCopies(int copies){this.copies = copies;}
    
    public int getCopies(){return copies;}

}
