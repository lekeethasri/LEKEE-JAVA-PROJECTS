import java.util.Scanner;
import java.util.Random;
public class Rockpaperscissor {
    public static void main(String[] args){
    Boolean y=true;
    Scanner s=new Scanner(System.in);
    while(y){
        String[] rps={"r","p","s"};
        String comturn=rps[new Random().nextInt(3)];
        String playerturn;
        while(true){
            System.out.println("Enter your move: ");
            playerturn=s.nextLine();
            if(playerturn.equals("r")||playerturn.equals("p")||playerturn.equals("s")){
                //System.out.println("Ok");
                break;
            }
            else System.out.println("Please enter a valid MOVE");
        }
        System.out.println("Computer's move "+comturn);
        if(playerturn.equals(comturn))System.out.println("Game is  a  tie");
        else if(playerturn.equals("p")){
            if(comturn.equals("s"))System.out.println("computer won");
            else System.out.println("Player won");
        }
        else if(playerturn.equals("r")){
            if(comturn.equals("p"))System.out.println("computer won");
            else System.out.println("Player won");
    }
    else if(playerturn.equals("s")){
        if(comturn.equals("r"))System.out.println("computer won");
        else System.out.println("Player won");
}
y=false;
while(true){
    System.out.println("Enter true or false to continue");
    if(s.hasNextBoolean()){
        y=s.nextBoolean();
        s.nextLine();
        break;
    }
    else{
        System.out.println("please Enter the valid input");
        s.next();
    }

}
if(!y)System.out.println("Thanks for playing!");
}
s.close();
}
}

