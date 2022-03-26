import java.util.ArrayList;
import java.util.Random;

public class Players extends Card{

    ArrayList <String> playerUser = new ArrayList<>();
    ArrayList <String> player2 = new ArrayList<>();
    ArrayList <String> player3 = new ArrayList<>();
    ArrayList <String> player4 = new ArrayList<>();
    ArrayList <String> newPlayPack = new ArrayList<>();
    ArrayList <String> fourPlayerCards = new ArrayList<>();


    String bot2Card;
    String bot3Card;
    String bot4Card;

    //this will select a card from pack and send it to the player hands and remove it from pack..............
    public void playersPack(ArrayList<String> playPack) {
        Random rand = new Random();
        newPlayPack = playPack;
        int i;
        int j;
        int k;
        int l;
        String rCard;

        for (i = 0; i<8; i++){

            rCard = newPlayPack.get(rand.nextInt(newPlayPack.size()));
            playerUser.add(rCard);
            newPlayPack.remove(rCard);
        }


        for (j = 0; j<8; j++){

            rCard = newPlayPack.get(rand.nextInt(newPlayPack.size()));
            player2.add(rCard);
            newPlayPack.remove(rCard);
        }


        for (k = 0; k<8; k++){

            rCard = newPlayPack.get(rand.nextInt(newPlayPack.size()));
            player3.add(rCard);
            newPlayPack.remove(rCard);

        }


        for (l = 0; l<8; l++){

            rCard = newPlayPack.get(rand.nextInt(newPlayPack.size()));
            player4.add(rCard);
            newPlayPack.remove(rCard);

        }

        /*System.out.print("Your Hand : "+playerUser);*/
        System.out.println();



    }

    public void firstHandPLayer(){
        String s;
        for (int i = 0;i<4;i++){
            s = playerUser.get(i);
            fourPlayerCards.add(s);
        }
        System.out.println("Your Call : "+fourPlayerCards);
    }

    public void randomSelectFromPlayerRobot2(ArrayList <String> player2){

        Random rand = new Random();
        bot2Card = player2.get(rand.nextInt(player2.size()));
        System.out.println("Bot 2 says : "+bot2Card);
        player2.remove(bot2Card);



    }
    public void randomSelectFromPlayerRobot3(ArrayList <String> player3){

        Random rand = new Random();
        bot3Card = player3.get(rand.nextInt(player3.size()));

        System.out.println("Bot 3 says : "+bot3Card);
        player3.remove(bot3Card);


    }
    public void randomSelectFromPlayerRobot4(ArrayList <String> player4){

        Random rand = new Random();

        bot4Card = player4.get(rand.nextInt(player4.size()));
        System.out.println("Bot 4 says : "+bot4Card);
        player4.remove(bot4Card);

    }




//if the winner of previous round is not user
    public void randomSelectFromPlayerRobot2Other(ArrayList <String> player2, String icon){


        for (int i = 0;i<player2.size();i++){
            if (player2.get(i).contains(icon)){
                bot2Card = player2.get(i);

                break;
            }
            else {
                bot2Card = player2.get(i);

            }
        }
        System.out.println("Bot 2 says : "+bot2Card);
        player2.remove(bot2Card);
    }

    public void randomSelectFromPlayerRobot3Other(ArrayList <String> player3, String icon){

        for (int i = 0;i<player3.size();i++){
            if (player3.get(i).contains(icon)){
                bot3Card = player3.get(i);

                break;
            }
            else {
                bot3Card = player3.get(i);

            }
        }

        System.out.println("Bot 3 says : "+bot3Card);
        player3.remove(bot3Card);
    }

    public void randomSelectFromPlayerRobot4Other(ArrayList <String> player4, String icon){

        for (int i = 0;i<player4.size();i++){
            if (player4.get(i).contains(icon)){
                bot4Card = player4.get(i);

                break;
            }
            else {
                bot4Card = player4.get(i);

            }
        }
        System.out.println("Bot 4 says : "+bot4Card);
        player4.remove(bot4Card);

    }
}