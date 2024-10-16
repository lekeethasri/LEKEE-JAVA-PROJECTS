import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
public class Guesser_game{
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        int guesser=new Random().nextInt(10);
        System.out.println("Enter how many players are playing: ");
        n=s.nextInt();
        List<Integer> player=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
        System.out.println("Player "+i+" Enter your number: ");
        int playerguess=s.nextInt();
        if(playerguess==guesser)
        player.add(i);
        }
        System.out.println("guesser number is "+guesser);
        if(player.isEmpty())System.out.println("No one won the game");
        else{
        System.out.println("won by");
        for(int item:player){
            System.out.println("player "+item+1);
        }
    }
    s.close();          
    }
}