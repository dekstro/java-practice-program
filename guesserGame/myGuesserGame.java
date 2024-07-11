package guesserGame;
import java.util.*;

class Guesser{
    int GuesserNum;
    public int guessNum(){
        Random rand = new Random();
        int rand_int = rand.nextInt(3);
        GuesserNum=rand_int;
        return GuesserNum;
    }
}

class Player{
    int PlayerNum;
    public int guessNum(){
        Scanner sc=new Scanner(System.in);
        PlayerNum=sc.nextInt();
        //sc.close();
        return PlayerNum;
    }
}

class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void collectNumFromGuesser(){
        Guesser G=new Guesser();
        Guessernum=G.guessNum();
    }

    public void collectNumFromPlayers(){
        System.out.println("Player1 kindly guess a number");
        Player P1=new Player();
        Playernum1=P1.guessNum();

        System.out.println("Player2 kindly guess a number");
        Player P2=new Player();
        Playernum2=P2.guessNum();

        System.out.println("Player3 kindly guess a number");
        Player P3=new Player();
        Playernum3=P3.guessNum();

        Guesser g=new Guesser();
        System.out.println("Computer number is: "+g.guessNum());
    }

    public void compare(){
        if (Guessernum==Playernum1) {
            if (Guessernum==Playernum2 && Guessernum==Playernum3) System.out.println("All Players won the game");
            else if (Guessernum==Playernum2) System.out.println("Player1 & 2 won the game");
            else if (Guessernum==Playernum3) System.out.println("Player1 & 3 won the game");
            else System.out.println("Player1 won the game");
        }
        else if (Guessernum==Playernum2) {
            if (Guessernum==Playernum3) System.out.println("Player2 & 3 won the game");
            else System.out.println("Player2 won the game");
        }
        else if (Guessernum==Playernum3) System.out.println("Player3 won the game");
        else System.out.println("None of the player won the game");
    }
}
public class myGuesserGame {
    public static void main(String[] args) {
        System.out.println("----------GAME STARTED---------");
        Umpire U=new Umpire();
        U.collectNumFromGuesser();
        U.collectNumFromPlayers();
        U.compare();
        System.out.println("----------GAME OVER------------");
    }
}
