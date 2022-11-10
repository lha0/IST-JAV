public class Bulbasaur extends myCharacter implements Training {    //Inherited from abstract class 'myCharacter' and interface 'Training'
    //Constructor
    public Bulbasaur(int hp, int atk, int def, int spd, int eur, int runCard) {
        setHp(hp);
        setAtk(atk);
        setDef(def);
        setSpd(spd);
        setEur(eur);
        setRA(runCard);
        setLevel(1);
        setTech1("LeechSeed");
        setTech2("VineWhip");
        setTech3("Tackle");

        System.out.println(">> Bulbasaur has been chosen !\n");
    }

    //Implementing functions in interface 'Training'
    @Override
    public void Attack() {
        int bbAtk = getAtk();
        bbAtk += 5;
        setAtk(bbAtk);
        System.out.println("\n-----Learned <<" + getTech1() + ">>-----");
        System.out.println("-Your ATTACK skill is +5 !!!-\n");
    }

    @Override
    public void Defence() {
        int bbDef = getDef();
        bbDef += 5;
        setDef(bbDef);
        System.out.println("\n-----Learned <<" + getTech2() + ">>-----");
        System.out.println("-Your DEFENCE skill is +5 !!!-\n");
    }

    @Override
    public void Speed() {
        int bbSpd = getSpd();
        bbSpd += 5;
        setSpd(bbSpd);
        System.out.println("\n-----Learned <<" + getTech3() + ">>-----");
        System.out.println("-Your SPEED skill is +5 !!!-\n");
    }
}

