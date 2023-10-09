import java.util.*;
class Main{
    public static void main(String[] args){
        //Objects
        Scanner console = new Scanner(System.in);
        ArrayList<String> input_auther = new ArrayList<String>();
        Book book = new Book();

        //Book Characteristics//
        System.out.println("Enter book title: ");
        String input_title = console.nextLine();
        book.setTitle(input_title);//gets and sets book title

        boolean trigger = false;
        System.out.println("Enter the name of the auther(s). Type -9 to end");//gets and sets book auther(s).
        do{
            String input = console.nextLine();
            input_auther.add(input);
            if(input.equals("-9")){
                //input_auther.remove(input_auther.get(input_auther.size()-1)); //Can't tell if the auther bug starts here or in the setAuther method
                trigger = true;
            }
        }while(trigger == false);

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
        System.out.println("Title: " + book.getTitle() + ", Auther(s): " + book.getAuther() + ", Publisher: " + book.getPublisher());//!!BUG!! Auther is not printed
        System.out.println("Price: " + book.getPrice() + ", Copies: " + book.getCopies());
    }
}
class Book{
    //global variables
    private String title = null;
    private ArrayList<String> auther = new ArrayList<String>();
    private String publisher = null;
    private float price = 0;
    private int copies = 0;
    
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(ArrayList<String> auther){//!!Bug!! Auther is not returned?
        this.auther = auther;
        for(int i = 0; i < auther.size(); i++){
            if(auther.get(i).equals("-9")){
                auther.remove(auther.get(i));
            }
        }
    }
    public ArrayList<String> getAuther(){
        return auther;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public float getPrice(){
        return price;
    }
    public void setCopies(int copies){
        this.copies = copies;
    }
    public int getCopies(){
        return copies;
    }

}
