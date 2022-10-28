import java.util.Scanner;
//import Exception.IllegalNumException;
//import Exception.ZeroException;


public class PlayGame {
    static boolean gameOn = true;

    static Scanner kbd = new Scanner(System.in);
    public static myCharacter chooseCharacter() {
        int pick = 0;
        myCharacter ch = null;

        System.out.println("Choose your character.");
        System.out.println("1. Squirtle\t2. Bulbasaur\t3. Charmander");
        pick = kbd.nextInt();

        switch(pick) {
            case 1: ch = new Squirtle(100, 8, 10, 12, 0, 0);
                break;
            case 2: ch = new Bulbasaur(100, 10, 13, 7, 0, 0);
                break;
            case 3: ch = new Charmander(100, 14, 8, 8, 0, 0);
                break;
         
                default: System.out.println("Wrong number! Please enter again with the number from 1 to 3.");
        }

        return ch;
    }

    public static void levelUp(myCharacter ch) {
        int Atk_ch = ch.getAtk();
        int Def_ch = ch.getDef();
        int Spd_ch = ch.getSpd();

        if ((Atk_ch >= 40) && (Def_ch >= 40) && (Spd_ch >= 40) && ch.getLevel() == 2) {
            ch.setLevel(3);
            System.out.println("Your character is on the final level");
            System.out.println("Congratulation");
            endGame(ch);
        } else if (Atk_ch >= 20 && Def_ch >= 20  && Spd_ch >= 20 && ch.getLevel() == 1) {
            ch.setLevel(2);
            System.out.println("Your character is on the 2nd level");
            System.out.println("Congratulation");
        }
    }

    public static void endGame(myCharacter ch) {
        if (ch.getHp() <= 0) {
            System.out.println("Your character is dead because your character HP is 0.");
            System.out.println("Game over");
        }
        
        gameOn = false;
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

        levelUp(ch);
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
    
    public static void Fight(myCharacter ch, Enemy enemy) {
        int total_stat_ch = ch.getAtk() + ch.getDef() + ch.getSpd();
        int total_stat_enemy = enemy.getAtk() + enemy.getDef() + enemy.getSpd();
        int HP = ch.getHp();
        int Euro = ch.getEur();

        if (total_stat_ch > total_stat_enemy) {
            System.out.println("지우가 승리했다!");
            //ch.setHp(HP - enemy.getAtk());
            ch.setEur(Euro + 30000000);
            System.out.println("로켓단은 도망갔다");            
        } else if (total_stat_ch < total_stat_enemy) {
            System.out.println("로켓단이 승리했다!");
            ch.setHp(HP - enemy.getAtk());
            HP = ch.getHp();
            if (HP <= 0) {
                endGame(ch);
            }
            if(Euro >= 30000000) ch.setEur(Euro - 30000000);
            else ch.setEur(0);
            System.out.println("지우는 눈앞이 깜깜해졌다….");
        }
        //같을 때 어떻게 할지


        enemy.setAtk(enemy.getAtk() + 3);
        enemy.setDef(enemy.getDef() + 3);
        enemy.setSpd(enemy.getSpd() + 3);
    }

    public static Enemy enemyShow(myCharacter ch, Enemy enemy) {
        int pick = 0;
        System.out.println("두두등장");
        
        enemy.showStat_enemy();

        System.out.println("\nDo you want to Fight or Run?");
        System.out.println("1. Fight\t2. Run");
        pick = kbd.nextInt();

        switch(pick) {
            case 1: Fight(ch, enemy);
                break;
            case 2: Run(ch, enemy);
                break;
            default: System.out.println("Wrong number! Please enter again with the number from 1 to 2.");
        }

        return enemy;
    }

    public static void Run(myCharacter ch, Enemy enemy){
        // ch.showStat();
        int RunCnt = ch.getRA();
        // System.out.println(RunCnt);
        if(RunCnt == 0){
            System.out.println("\nOOPS!! You do NOT have any RUN CARD ! :(");
            System.out.println("You have to fight!");
            Fight(ch, enemy);
        }
        else if(RunCnt > 0){
            ch.setRA(--RunCnt);
            System.out.println("\nLUCKY!! YOU RUN AWAY from enemy by USING \"1\" RUN CARD ! :)");
            System.out.printf("Your Left RUN CARD : %d\n", RunCnt);
        }
    }
        

    public static void manual(myCharacter ch, Enemy enemy) {
        int pick = 0;
        int cnt = 0;

        while(gameOn) {
            cnt++;
            if (cnt % 4 == 0) {
                enemyShow(ch, enemy);
            } else {
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
                    case 4: enemy.showStat_enemy();
                        break;
                    case 5: gameOn = false;
                        break;
                    default: System.out.println("Wrong number! Please enter again with the number from 1 to 4 .");
                }
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("Now start the game . . . !\n");
        myCharacter ch = null;

        ch = chooseCharacter();
        Enemy enemy = new Enemy(100, 10, 8, 7);

        manual(ch, enemy);
    }
}