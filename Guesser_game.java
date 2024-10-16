import java.util.Scanner;
import java.util.Random;
public class Guesser_game{
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        int guesser=new Random().nextInt(10);
        System.out.println("Enter how many players are playing: ");
        n=s.nextInt();
        int[] player =new int[n];
        for(int i=1;i<=n;i++){
        System.out.println("Player "+i+" Enter your number: ");
        int playerguess=s.nextInt();
        if(playerguess==guesser)
        player[i]=i;
        }
        if(player.length==0)System.out.println("No one won the game");
        else{
        System.out.println("players won")
        for int item:player{
            System.out.println(item);
        }
    }          
    }
}