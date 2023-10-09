import java.util.*; 
class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner console = new Scanner(System.in);
        int randomNum = random.nextInt(10,90);
        int guess = 0;
        int tries = 0;


        System.out.println(" Guess a number between 10 and 90: ");
        do{
            guess = console.nextInt();
            tries++;
            if(tries >= 1){
                if(guess > randomNum) System.out.println("The number is lower!");
                else if(guess < randomNum) System.out.println("The number is higher!");
            }
        }while(guess != randomNum);
        System.out.println(" YOU WIN!!! It took you " + tries + " tries");
    }
}
