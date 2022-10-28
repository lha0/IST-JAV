import java.util.Scanner;
//import Exception.IllegalNumException;
//import Exception.ZeroException;

public class PlayGame {
    static Scanner kbd = new Scanner(System.in);
    public static myCharacter chooseCharacter() {
        int pick = 0;
        myCharacter ch = null;

        System.out.println("Choose your character.");
        System.out.println("1. Squirtle\t2. Bulbasaur\t3. Charmander");
        pick = kbd.nextInt();

        switch(pick) {
            case 1: ch = new Squirtle(100, 8, 10, 12, 0);
                break;
            case 2: ch = new Bulbasaur(100, 10, 13, 7, 0);
                break;
            case 3: ch = new Charmander(100, 14, 8, 8, 0);
                break;
         
                default: System.out.println("Wrong number! Please enter again with the number from 1 to 3.");
        }

        return ch;
    }

    public static void showTraining(myCharacter ch){
        System.out.println(" ================================================");
        System.out.println("|   1." + ch.getTech1()+"   |   2."+ch.getTech2()+"   |   3."+ch.getTech3()+"   |");
        System.out.println(" ================================================");
        
        int tech;
        tech = kbd.nextInt();

        if(tech == 1){
            ch.Attack();
        }
        else if(tech == 2){
            ch.Defence();
        }
        else if(tech == 3){
            ch.Speed();
        }
        else{
            System.out.printf("\"%d\" is Invalid technique number !\n", tech);
        }
    }

    public static void Item(myCharacter ch) {
        int pick = 0;
        System.out.println("1. Hp potion(50,000,000 euro)\t2. Run Card(100,000,000 euro)");
        pick = kbd.nextInt();

        if (pick == 1) {
            if (ch.getEur() > 50000000) {
                System.out.println("You bought a health potion!");

                int HP = ch.getHp();
                ch.setHp(HP+5);
                
                int Coin1 = ch.getEur();
                ch.setEur(Coin1-50000000); 
                
                System.out.println("5 HP point had raised!");
            } else { 
                System.out.println("You don't have enough money!");
            }    

        } else {
            if (ch.getEur() > 100000000) {
                System.out.println("You bought a runaway card!");
    
                int RA = ch.getRA();
                ch.setRA(RA+1);
                
                int Coin2 = ch.getEur();
                ch.setEur(Coin2-100000000);
            } else { 
                System.out.println("You don't have enough money!");
            }
        }        
    }
        

    public static void manual(myCharacter ch) {
        int pick = 0;
        boolean gameOn = true;
        while(gameOn) {
            System.out.println("\nWhat do you want to do with your character!");
            System.out.println("1. Training\t2. Show character stat\t3. Buy item\t4. Show enemy stat\t5. Exit");
            pick = kbd.nextInt();

            switch(pick) {
                case 1: showTraining(ch);
                    break;
                case 2: ch.showStat();
                    break;
                case 3: Item(ch);
                    break;
                case 4: System.out.println("test"); //showStat_enemy();
                    break;
                case 5: gameOn = false;
                    break;
                default: System.out.println("Wrong number! Please enter again with the number from 1 to 4 .");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Now start the game . . . !\n");
        myCharacter ch = null;

        ch = chooseCharacter();

        manual(ch);
    }
}