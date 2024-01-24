import java.util.Random;
import java.util.Scanner;

public class    numberguessing {
    public static void main(String[] args) {
        Random rand =new Random();
        int randonnumber= rand.nextInt(100)+1;
        System.out.println("-----------------Guess a number using 10 random guesses------------------");

        Scanner sc=new Scanner(System.in);
int trycount=0;

    while (true) {
        if (trycount <= 10) {

            System.out.println("Guess a number between 1 to 100 ");
            int guessednumber = sc.nextInt();
            trycount++;

            if (guessednumber == randonnumber) {
                System.out.println("congrats! you got it.");
                System.out.println("you took "+trycount+" chances ");

                if (trycount<5){
                    System.out.println("Excellent");
                } else if (trycount<8) {
                    System.out.println("Good ");
                }
                else {
                    System.out.println("Try to use some logic too");
                }
                break;

            } else if (guessednumber > randonnumber) {
                System.out.println("Guessednumber is greater than random number. try some small number");
            } else {
                System.out.println("Guessednumber is smaller than random number. try some larger number");
            }
            if(trycount==10){
                System.out.println("Better luck next time");
                break;
            }

        }
    }
    }
}
