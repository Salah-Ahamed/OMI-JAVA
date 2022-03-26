import java.util.Scanner;

public class Omi {




    public static void main (String[] args) {

        Card cardObject = new Card();
        Players playerObject = new Players();
        User userObject = new User();
        TrumpSelection trumpObject = new TrumpSelection();
        Winner winner = new Winner();


        cardObject.Cards();
        //System.out.println();
        playerObject.playersPack(cardObject.getPlayPack());
        //System.out.println();


        Scanner sc = new Scanner(System.in);
        System.out.println("You wanna play ? : ");

        String plays = sc.nextLine();
        if (plays.equalsIgnoreCase("yes")) {
            userObject.UserName();
            System.out.println();
            playerObject.firstHandPLayer();
            System.out.println();
            trumpObject.selectTrumpIcon();
            System.out.println();
            System.out.println("Trump is : " + trumpObject.trump);

            cardObject.trumpCards(playerObject.playerUser, trumpObject.trump);
            //System.out.println(c.trumpPack);
            System.out.println();
            String cardIcon;
            int round = 1;
            int i = 0;
            while (i < 8) {

                if (winner.winner.equals("Bot 2")) {
                    System.out.println("Round : " + round);
                    System.out.println("Your Hand : " + playerObject.playerUser);
                    System.out.println("Please type: (1) (2) (3) (4) (5) (6) (7) (8)");
                    System.out.println();
                /*System.out.println("Bot 2 Hand : "+p.player2);
                System.out.println("Bot 3 Hand : "+p.player3);
                System.out.println("Bot 4 Hand : "+p.player4);*/

                    playerObject.randomSelectFromPlayerRobot2(playerObject.player2);
                    cardIcon = playerObject.bot2Card.substring(0, 1);
                    playerObject.randomSelectFromPlayerRobot3Other(playerObject.player3, cardIcon);
                    playerObject.randomSelectFromPlayerRobot4Other(playerObject.player4, cardIcon);

                    userObject.playerCard(playerObject.playerUser, cardIcon);
                    playerObject.playerUser.remove(userObject.card);

                    winner.playerCardValue(userObject.card);
                    winner.playerCardValue2(playerObject.bot2Card);
                    winner.player3CardValue(playerObject.bot3Card);
                    winner.player4CardValue(playerObject.bot4Card);
                    winner.win(winner.maxValue, winner.winner);
                    System.out.println(winner.winner);
                    winner.valueUser1.clear();
                    winner.valueBot2.clear();
                    winner.valueBot3.clear();
                    winner.valueBot4.clear();
                    winner.maxValue = 0;
                    winner.allValues.clear();

                    i = i + 1;
                    round = round + 1;
                    System.out.println();


                } else if (winner.winner.equals("Bot 3")) {
                    System.out.println("Round : " + round);
                    System.out.println("Your Hand : " + playerObject.playerUser);
                /*System.out.println("Bot 2 Hand : "+p.player2);
                System.out.println("Bot 3 Hand : "+p.player3);
                System.out.println("Bot 4 Hand : "+p.player4);*/
                    playerObject.randomSelectFromPlayerRobot3(playerObject.player3);
                    cardIcon = playerObject.bot3Card.substring(0, 1);
                    playerObject.randomSelectFromPlayerRobot2Other(playerObject.player2, cardIcon);
                    playerObject.randomSelectFromPlayerRobot4Other(playerObject.player4, cardIcon);


                    userObject.playerCard(playerObject.playerUser, cardIcon);
                    playerObject.playerUser.remove(userObject.card);

                    winner.playerCardValue(userObject.card);
                    winner.playerCardValue2(playerObject.bot2Card);
                    winner.player3CardValue(playerObject.bot3Card);
                    winner.player4CardValue(playerObject.bot4Card);
                    winner.win(winner.maxValue, winner.winner);
                    winner.valueUser1.clear();
                    winner.valueBot2.clear();
                    winner.valueBot3.clear();
                    winner.valueBot4.clear();
                    winner.maxValue = 0;
                    winner.allValues.clear();

                    i = i + 1;
                    round = round + 1;
                    System.out.println();

                } else if (winner.winner.equals("Bot 4")) {

                    System.out.println("Round : " + round);
                    System.out.println("Your Hand : " + playerObject.playerUser);
                /*System.out.println("Bot 2 Hand : "+p.player2);
                System.out.println("Bot 3 Hand : "+p.player3);
                System.out.println("Bot 4 Hand : "+p.player4);*/
                    playerObject.randomSelectFromPlayerRobot4(playerObject.player4);
                    cardIcon = playerObject.bot4Card.substring(0, 1);
                    playerObject.randomSelectFromPlayerRobot2Other(playerObject.player2, cardIcon);
                    playerObject.randomSelectFromPlayerRobot3Other(playerObject.player3, cardIcon);


                    userObject.playerCard(playerObject.playerUser, cardIcon);
                    playerObject.playerUser.remove(userObject.card);

                    winner.playerCardValue(userObject.card);
                    winner.playerCardValue2(playerObject.bot2Card);
                    winner.player3CardValue(playerObject.bot3Card);
                    winner.player4CardValue(playerObject.bot4Card);
                    winner.win(winner.maxValue, winner.winner);
                    winner.valueUser1.clear();
                    winner.valueBot2.clear();
                    winner.valueBot3.clear();
                    winner.valueBot4.clear();
                    winner.maxValue = 0;
                    winner.allValues.clear();

                    i = i + 1;
                    round = round + 1;
                    System.out.println();
                } else if (winner.winner.equals("You")) {
                    System.out.println("Round : " + round);
                    System.out.println("Your Hand : " + playerObject.playerUser);
                /*System.out.println("Bot 2 Hand : "+p.player2);
                System.out.println("Bot 3 Hand : "+p.player3);
                System.out.println("Bot 4 Hand : "+p.player4);*/
                    userObject.playerCard2(playerObject.playerUser);
                    cardIcon = userObject.card.substring(0, 1);
                    playerObject.randomSelectFromPlayerRobot2Other(playerObject.player2, cardIcon);
                    playerObject.randomSelectFromPlayerRobot4Other(playerObject.player4, cardIcon);
                    playerObject.randomSelectFromPlayerRobot3Other(playerObject.player3, cardIcon);
                    playerObject.playerUser.remove(userObject.card);


                    winner.playerCardValue(userObject.card);
                    winner.playerCardValue2(playerObject.bot2Card);
                    winner.player3CardValue(playerObject.bot3Card);
                    winner.player4CardValue(playerObject.bot4Card);
                    winner.win(winner.maxValue, winner.winner);
                    winner.valueUser1.clear();
                    winner.valueBot2.clear();
                    winner.valueBot3.clear();
                    winner.valueBot4.clear();
                    winner.maxValue = 0;
                    winner.allValues.clear();

                    i = i + 1;
                    round = round + 1;
                    System.out.println();
                }

            }

            winner.roundWinner(userObject.userName);
            System.out.println("You wanna see past winners ? :");
            String pastselection = sc.nextLine();
            if (pastselection.equalsIgnoreCase("yes")){
                winner.pastPlayers(winner.roundWinner);
            }
            else{
                System.exit(0);
            }


        }
        else{
            System.exit(0);
        }
    }



}