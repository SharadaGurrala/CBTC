import java.util.Random;
import java.util.Scanner;

public class Guess_Number{
    public static void main(String args[]){
        Scanner num = new Scanner(System.in);
        Random random = new Random();

        System.out.print("welcome to the Guess Number game!\n");
        int maxattempt = 10;
        int attempt = 0;
        int round=6;
        boolean guess=false;
        int score=0;

        int guessnum = random.nextInt(100)+1;
        System.out.print("Random number is generated \n Now guess the number\n");
        System.out.print("enter your guess here\n");
        while(attempt <= maxattempt && !guess){
            //for(int i=1;i<=round;i++){
            
            int yours = num.nextInt();
            
            if(yours == guessnum){
                System.out.print("congrants its correct\n");
                score+=1;
                guess=true;
                break;
            }
            
            else if(yours < guessnum){
                System.out.print("guess high!\n");
            }
            else{
            System.out.print("guess low!\n");
            }
            
            //System.out.print("in round "+i+" in "+attempt+" attempt of total "+maxattempt+" your score is "+score+"\n");
            
            attempt++;
            System.out.print(" in "+attempt+" attempt of total "+maxattempt+" your score is "+score+"\n");
            
        }

        




        
        System.out.print("finally "+attempt+" attempts\n");
        
        System.out.print("your score is "+score+"\n");

    }
}


