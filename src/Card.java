import java.util.ArrayList;

public class Card {



    ArrayList <String> shape = new ArrayList<>();
    ArrayList <String> rank = new ArrayList<>();

    ArrayList <String> pack = new ArrayList<>();
    ArrayList <String> trumpPack = new ArrayList<>();

    public ArrayList<String> getPlayPack() {
        return playPack;
    }

    public void setPlayPack(ArrayList<String> playPack) {
        this.playPack = playPack;
    }

    private ArrayList <String> playPack = new ArrayList<>();





    public void Cards() {


        shape.add("♠");
        shape.add("♦");
        shape.add("♥");
        shape.add("♣");



        rank.add("2");
        rank.add("3");
        rank.add("4");
        rank.add("5");
        rank.add("6");
        rank.add("7");
        rank.add("8");
        rank.add("9");
        rank.add("10");
        rank.add("J");
        rank.add("Q");
        rank.add("K");
        rank.add("A");




        String val;
        for (int i = 0; i< shape.size(); i++) {

            for (int j = 0; j< rank.size(); j++) {

                val = shape.get(i)+rank.get(j);
                pack.add(val);


            }

        }

        String valu;
        for (int i = 0; i< shape.size(); i++) {

            for (int j = 5; j< rank.size(); j++) {

                valu = shape.get(i)+rank.get(j);
                playPack.add(valu);


            }

        }

        /*System.out.print(pack);
        System.out.println();
        System.out.print(playPack);*/
    }

    //this will add all the trump cards to a list
    public void trumpCards(ArrayList<String> playerUser,String trump){
        String s;
        for (int i=0; i<playerUser.size();i++){
            if (playerUser.get(i).contains(trump)){
                s = playerUser.get(i);
                trumpPack.add(s);
            }

        }

    }


}