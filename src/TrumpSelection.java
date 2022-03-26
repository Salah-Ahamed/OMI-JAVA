import java.util.Scanner;

public class TrumpSelection {
    String trump = "";
    String trumpIcon = "";


    public void selectTrumpIcon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your trump");
        System.out.println ("NOTE : TYPE 1 for '♣' , 2 for '♦', 3 for '♥', 4 for '♠'");

        trumpIcon = sc.nextLine();
        trumpCondition(trumpIcon);
    }

    public void trumpCondition(String trumpIcon){
        if (trumpIcon.equals("1")) {
            trump = "♣";
        }
        else if(trumpIcon.equals("2")){
                trump = "♦";
        }
        else if(trumpIcon.equals("3")){
                trump = "♥";
        }
        else if(trumpIcon.equals("4")){
                trump = "♠";
        }
        else{
            selectTrumpIcon();
        }
    }


}
