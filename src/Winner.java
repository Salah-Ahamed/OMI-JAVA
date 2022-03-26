import java.util.ArrayList;
import java.util.Collections;


public class Winner {

    Integer maxValue;
    String winner = "Bot 2";
    int userPoints = 0;
    int bot2Points = 0;
    int bot3Points = 0;
    int bot4Points = 0;
    int max;
    String roundWinner;

    ArrayList<Integer> valueUser1 = new ArrayList<>();
    ArrayList<Integer> valueBot2 = new ArrayList<>();
    ArrayList<Integer> valueBot3 = new ArrayList<>();
    ArrayList<Integer> valueBot4 = new ArrayList<>();
    ArrayList<Integer> allValues = new ArrayList<>();
    ArrayList<String> pastPlayerName = new ArrayList<>();
    ArrayList<Integer> pastPlayerPoints = new ArrayList<>();

    // this will help to find the winner...........................
    public void playerCardValue(String card){
        if (card.contains("7")){
            valueUser1.add(7);
        }
        else if (card.contains("8")){
            valueUser1.add(8);
        }
        else if (card.contains("9")){
            valueUser1.add(9);
        }
        else if (card.contains("10")){
            valueUser1.add(10);
        }
        else if (card.contains("J")){
            valueUser1.add(11);
        }
        else if (card.contains("Q")){
            valueUser1.add(12);
        }
        else if (card.contains("K")){
            valueUser1.add(13);
        }
        else if (card.contains("A")){
            valueUser1.add(14);
        }

        System.out.println(valueUser1 + "User Value");
        allValues.addAll(valueUser1);

    }
    public void playerCardValue2(String card2){
        if (card2.contains("7")){
            valueBot2.add(7);
        }
        else if (card2.contains("8")){
            valueBot2.add(8);
        }
        else if (card2.contains("9")){
            valueBot2.add(9);
        }
        else if (card2.contains("10")){
            valueBot2.add(10);
        }
        else if (card2.contains("J")){
            valueBot2.add(11);
        }
        else if (card2.contains("Q")){
            valueBot2.add(12);
        }
        else if (card2.contains("K")){
            valueBot2.add(13);
        }
        else if (card2.contains("A")){
            valueBot2.add(14);
        }

        System.out.println(valueBot2 + "Bot 2 Value");
        allValues.addAll(valueBot2);

    }
    public void player3CardValue(String card3){
        if (card3.contains("7")){
            valueBot3.add(7);
        }
        else if (card3.contains("8")){
            valueBot3.add(8);
        }
        else if (card3.contains("9")){
            valueBot3.add(9);
        }
        else if (card3.contains("10")){
            valueBot3.add(10);
        }
        else if (card3.contains("J")){
            valueBot3.add(11);
        }
        else if (card3.contains("Q")){
            valueBot3.add(12);
        }
        else if (card3.contains("K")){
            valueBot3.add(13);
        }
        else if (card3.contains("A")){
            valueBot3.add(14);
        }

        System.out.println(valueBot3 + "Bot 3 value");
        allValues.addAll(valueBot3);

    }
    public void player4CardValue(String card4){
        if (card4.contains("7")){
            valueBot4.add(7);
        }
        else if (card4.contains("8")){
            valueBot4.add(8);
        }
        else if (card4.contains("9")){
            valueBot4.add(9);
        }
        else if (card4.contains("10")){
            valueBot4.add(10);
        }
        else if (card4.contains("J")){
            valueBot4.add(11);
        }
        else if (card4.contains("Q")){
            valueBot4.add(12);
        }
        else if (card4.contains("K")){
            valueBot4.add(13);
        }
        else if (card4.contains("A")){
            valueBot4.add(14);
        }

        System.out.println(valueBot4 + "Bot 4 value");
        allValues.addAll(valueBot4);

        //System.out.println(allValues);
        maxValue = Collections.max(allValues);

        System.out.println(maxValue);
        allValues.clear();

    }

    public void win(Integer maxValue, String winr){
        this.maxValue = maxValue;

        if (valueUser1.contains(maxValue)){

            winr = "You";
            userPoints = userPoints + 2;
        }
        else if (valueBot2.contains(maxValue)){

            winr = "Bot 2";
            bot2Points = bot2Points + 2;
        }
        else if (valueBot3.contains(maxValue)){

            winr = "Bot 3";
            bot3Points = bot3Points+3;
        }
        else if (valueBot4.contains(maxValue)){

            winr = "Bot 4";
            bot4Points = bot4Points +2;
        }
        this.winner = winr;
        System.out.println(winr+ " won the hand");

    }

    public void roundWinner(String userName){
        /*System.out.println(bot2Points);
        System.out.println(bot3Points);
        System.out.println(bot4Points);
        System.out.println(userPoints);*/
        max = bot2Points;
        roundWinner = "Bot 3";
        if (bot3Points > max){
            max = bot3Points;
            roundWinner = "Bot 3";
        }
        if (bot4Points > max){
            max = bot4Points;
            roundWinner = "Bot 4";
        }
        if (userPoints > max){
            max = userPoints;
            roundWinner = userName;
        }
        System.out.println();
        System.out.println("FINAL RESULTS !!!!!");
        System.out.println(roundWinner+" won the match with "+max+" points.");
    }

    public void pastPlayers(String roundWinner){
        pastPlayerName.add(roundWinner);
        pastPlayerPoints.add(max);
        for (int i = 0;i<roundWinner.length();i++);{
            System.out.println("Past winner : "+roundWinner+ " with "+ max + " points" );
        }
    }

}
