
import java.util.ArrayList;
import java.util.Scanner;
public class User {



        String userName;
        String card;
        String cardIconP;

    public void UserName(){

        Scanner input = new Scanner(System.in);
        System.out.println ("Enter Your Name Here : ");

        userName = input.nextLine();

        if (!userName.equals("")){

            System.out.println(userName);


        }
        else{

            UserName();
        }

    }



//this will get card from user and check it if its acceptable or not.....................
    public void playerCard(ArrayList<String> playerUser,String icon){
        int s = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your card here : ");

        card = sc.nextLine();

            for(int i = 0;i<playerUser.size();i++) {
                if (playerUser.get(i).contains(icon)) {
                    s = s + 1;
                } else {
                    ;
                }
            }
                /*System.out.println(card);
                System.out.println("S value is" + s);*/
                if (s >= 1) {
                    try {
                        if (card.equals("1")) {
                            card = playerUser.get(0);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("2")) {
                            card = playerUser.get(1);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("3")) {
                            card = playerUser.get(2);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("4")) {
                            card = playerUser.get(3);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("5")) {
                            card = playerUser.get(4);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("6")) {
                            card = playerUser.get(5);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("7")) {
                            card = playerUser.get(6);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else if (card.equals("8")) {
                            card = playerUser.get(7);
                            if (card.contains(icon)) {
                                System.out.println(card);
                            } else {
                                System.out.println("Check your card :)");
                                playerCard(playerUser, icon);
                            }
                        } else {
                            System.out.println("This card is not in player card");
                            playerCard(playerUser, icon);
                        }
                    } catch (Exception E) {
                        System.out.println("Check your card");
                        playerCard(playerUser, icon);
                    }
                } else {      //this will allow the card if selected shape is not in player hand
                    try {
                        if (card.equals("1")) {
                            card = playerUser.get(0);
                            System.out.println(card);

                        } else if (card.equals("2")) {
                            card = playerUser.get(1);
                            System.out.println(card);
                        } else if (card.equals("3")) {
                            card = playerUser.get(2);
                            System.out.println(card);
                        } else if (card.equals("4")) {
                            card = playerUser.get(3);
                            System.out.println(card);
                        } else if (card.equals("5")) {
                            card = playerUser.get(4);
                            System.out.println(card);
                        } else if (card.equals("6")) {
                            card = playerUser.get(5);
                            System.out.println(card);
                        } else if (card.equals("7")) {
                            card = playerUser.get(6);
                            System.out.println(card);
                        } else if (card.equals("8")) {
                            card = playerUser.get(7);
                            System.out.println(card);
                        } else {
                            System.out.println("This card is not in player card");
                            playerCard2(playerUser);

                        }

                    } catch (Exception E) {
                        System.out.println("Check your card");
                        playerCard2(playerUser);
                    }
                }


    }

    public void playerCard2(ArrayList<String> playerUser){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your card here : ");

        card = sc.nextLine();
        try{
            if(card.equals("1")){
                card = playerUser.get(0);
                System.out.println(card);

            }
            else if (card.equals("2")){
                card = playerUser.get(1);
                System.out.println(card);
            }
            else if (card.equals("3")){
                card = playerUser.get(2);
                System.out.println(card);
            }
            else if (card.equals("4")){
                card = playerUser.get(3);
                System.out.println(card);
            }
            else if (card.equals("5")){
                card = playerUser.get(4);
                System.out.println(card);
            }
            else if (card.equals("6")) {
                card = playerUser.get(5);
                System.out.println(card);
            }
            else if (card.equals("7")){
                card = playerUser.get(6);
                System.out.println(card);
            }
            else if (card.equals("8")){
                card = playerUser.get(7);
                System.out.println(card);
            }
            else{
                System.out.println("This card is not in player card");
                playerCard2(playerUser);

            }

        }
        catch (Exception E){
            System.out.println("Check your card");
            playerCard2(playerUser);
        }

    }



}
