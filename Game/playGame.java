import java.util.Scanner;

public class playGame {
    static boolean gameOn = true;
    static Scanner keyboard = new Scanner(System.in);

    public static myCharacter chooseCharacter() {   //Method for choosing Character
        int pick = 0;
        myCharacter ch = null;

        System.out.println("\n ============= Choose your character =============");
        System.out.println("|  1. Squirtle    2. Bulbasaur    3. Charamander |");
        System.out.println(" =================================================");
        System.out.print(": ");
        pick = keyboard.nextInt();

        switch(pick) {
            case 1: ch = new Squirtle(100, 8, 10, 12, 0, 0);    //Basic stat for character(Hp, Attack, Defence, Speed, Euro, RunAway)
                break;
            case 2: ch = new Bulbasaur(100, 10, 13, 7, 0, 0);
                break;
            case 3: ch = new Charmander(100, 14, 8, 8, 0, 0);
                break;
            default: System.out.println(">> Wrong number! Please enter again with the number from 1 to 3.");   //Exception for not using proper numbers
        }
        return ch;
    }

    public static void levelUp(myCharacter ch) {    //Method for level up of character
        int chAtk = ch.getAtk();
        int chDef = ch.getDef();
        int chSpd = ch.getSpd();

        //Condition for level up 
        if (chAtk >= 20 && chDef >= 20  && chSpd >= 20 && ch.getLevel() == 1) {
            ch.setLevel(2);
            System.out.println(">> Your character is on the 2nd level");
            System.out.println(">> Congratulation!");
        } else if ((chAtk >= 40) && (chDef >= 40) && (chSpd >= 40) && ch.getLevel() == 2) {
            ch.setLevel(3);
            System.out.println(">> Your character is on the final level");
            System.out.println(">> Congratulation!");
            endGame(ch);    //When character reached level 3, Game is over 
        }
    }

    public static void endGame(myCharacter ch) {    //Method for ending the game
        if (ch.getHp() <= 0) {  //When character's hp is 0, Game is over 
            System.out.println(">> Your character is dead because your character HP is 0.");
            System.out.println(">> Game over");
        }
        gameOn = false;
    }


    public static void showTraining(myCharacter ch) {    //Method for training 
        int pick;

        System.out.println("\n ================ Choose Skill =================");
        System.out.println("|   1." + ch.getTech1()+"   |   2." + ch.getTech2()+"   |   3." + ch.getTech3()+"   |");
        System.out.println(" ================================================");
        System.out.print(": ");
        pick = keyboard.nextInt();

        if (pick == 1) {
            ch.Attack();    //Training attack skill
        } else if (pick == 2){
            ch.Defence();   //Training defence skill
        } else if (pick == 3){
            ch.Speed();     //Training speed skill
        } else {
            System.out.println(">> Wrong number! Please enter again with the number from 1 to 3.");  //Exception for not using proper numbers
        }
        levelUp(ch);    //Checking the condition of level up
    }

    public static void Item(myCharacter ch) {   //Method for buying item
        int pick = 0;
        System.out.println("\n ========================== Choose item ==========================");
        System.out.println("| 1. Hp potion(50,000,000 euro)    2. Run Card(100,000,000 euro) |");
        System.out.println(" =================================================================");
        System.out.print(": ");
        pick = keyboard.nextInt();

        if (pick == 1) {    //Buying Hp potion
            if (ch.getEur() > 50000000) {   //Checking enough money
                System.out.println(">> You bought a health potion!");
                
                int hp = ch.getHp();    
                ch.setHp(hp + 5);     //Increasing character's HP
                
                int euro = ch.getEur();
                ch.setEur(euro - 50000000); 
                
                System.out.println(">> 5 HP point had raised!");
            } else { 
                System.out.println(">> You don't have enough money!");
            }    

        } else {    //Buying RunAway card
            if (ch.getEur() > 100000000) {  //Checking enough money
                System.out.println(">> You bought a runaway card!");
    
                int runCard = ch.getRA();
                ch.setRA(runCard + 1);     //Add one runaway card
                
                int euro = ch.getEur();
                ch.setEur(euro - 100000000);
            } else { 
                System.out.println(">> You don't have enough money!");
            }
        }        
    }
    
    public static void Fight(myCharacter ch, Enemy enemy) { //Method for fight with enemy
        int chTotalStat = ch.getAtk() + ch.getDef() + ch.getSpd();    //Calculating total stat of character
        int enemyTotalStat = enemy.getAtk() + enemy.getDef() + enemy.getSpd();    //Calculating total stat of enemy
        int hp = ch.getHp();
        int euro = ch.getEur();

        if (chTotalStat > enemyTotalStat) { //Condition for win
            System.out.println(">> Jiwoo has won!");
            ch.setHp(hp - enemy.getAtk());
            ch.setEur(euro + 30000000);
            System.out.println(">> Rocket Team ran away!"); 

        } else if (chTotalStat < enemyTotalStat) {  //Condition for lose
            System.out.println(">> Rocket Team has won!");
            ch.setHp(hp - enemy.getAtk());
            hp = ch.getHp();

            if (hp <= 0) endGame(ch);    //Checking Hp

            if (euro >= 30000000) ch.setEur(euro - 30000000);
            else ch.setEur(0);
            
            System.out.println(">> Jiwoo failed ...");

        } else {    //Condition for draw
            System.out.println(">> Draw");
            System.out.println(">> Please try once again");
        }

        //Enemy level increases every fight
        enemy.setAtk(enemy.getAtk() + 3);
        enemy.setDef(enemy.getDef() + 3);
        enemy.setSpd(enemy.getSpd() + 3);
    }

    public static Enemy enemyShow(myCharacter ch, Enemy enemy) {    //Method for appearance of enemy
        int pick = 0;
        System.out.println(">> . . .");
        System.out.println(">> BoooooooooM!");
        System.out.println(">> Rocket Team has appeared !!!");
        
        enemy.showStatEnemy();

        System.out.println("\n =================================");
        System.out.println("Do you want to Fight or Run away?");
        System.out.println("|    1. Fight    2. Run away    |");
        System.out.println(" =================================");
        System.out.print(": ");
        pick = keyboard.nextInt();

        switch(pick) {
            case 1: Fight(ch, enemy);
                break;
            case 2: Run(ch, enemy);
                break;
            default: System.out.println(">> Wrong number! Please enter again with the number from 1 to 2.");   //Exception for not using proper numbers
        }

        return enemy;
    }

    public static void Run(myCharacter ch, Enemy enemy) {   //Method for using runaway card
        int runCnt = ch.getRA();
        
        if (runCnt == 0) {   //Checking runaway card
            System.out.println("\n>> OOPS!! You do NOT have any RUN CARD ! :(");
            System.out.println(">> You have to fight!");
            Fight(ch, enemy); 
        } else if (runCnt > 0) {
            ch.setRA(--runCnt);
            System.out.println("\n>> LUCKY!! YOU RUN AWAY from enemy by USING \"1\" RUN CARD ! :)");
            System.out.printf(">> Your Left RUN CARD : %d\n", runCnt);
        }
    }

    public static void Manual(myCharacter ch, Enemy enemy) {    //Method for showing main menu
        int pick = 0;
        int cnt = 0;    //After every 3 choices of menu, enemy appears

        while(gameOn) {
            cnt++;
            if (cnt % 4 == 0) {
                enemyShow(ch, enemy);
            } else {
                
                System.out.println(" \n =================== What do you want to do with your character? ===================");
                System.out.println("| 1. Training   2. Show character stat   3. Buy item   4. Show enemy stat   5. Exit |");
                System.out.println(" =====================================================================================");
                System.out.print(": ");
                pick = keyboard.nextInt();

                switch(pick) {
                    case 1: showTraining(ch);
                        break;
                    case 2: ch.showStat();
                        break;
                    case 3: Item(ch);
                        break;
                    case 4: enemy.showStatEnemy();
                        break;
                    case 5: gameOn = false;
                        break;
                    default: System.out.println(">> Wrong number! Please enter again with the number from 1 to 4 ."); //Exception for not using proper numbers
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(">> Now start the game . . . !");
        myCharacter ch = null;  

        ch = chooseCharacter(); //Initializing character
        Enemy enemy = new Enemy(100, 10, 8, 7); //Basic stat for enemy(Hp, Attack, Defence, Speed)

        Manual(ch, enemy);  //Showing main menu
    }
}