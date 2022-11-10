public class Squirtle extends myCharacter implements Training { //Inherited from abstract class 'myCharacter' and interface 'Training'
    //Constructor
    public Squirtle(int hp, int atk, int def, int spd, int eur, int runCard) {
        setHp(hp);
        setAtk(atk);
        setDef(def);
        setSpd(spd);
        setEur(eur);
        setRA(runCard);
        setLevel(1);
        setTech1("Tackle");
        setTech2("TailWhip");
        setTech3("WaterGun");

        System.out.println(">> Squirtle has been chosen !\n");
    }

    //Implementing functions in interface 'Training'
    @Override
    public void Attack() {
        int sqAtk = getAtk();
        sqAtk += 5;
        setAtk(sqAtk);
        System.out.println("\n-----Learned <<" + getTech1() + ">>-----");
        System.out.println("-Your ATTACK skill is +5 !!!-\n");
    }

    @Override
    public void Defence() {
        int sqDef = getDef();
        sqDef += 5;
        setDef(sqDef);
        System.out.println("\n-----Learned <<" + getTech2() + ">>-----");
        System.out.println("-Your DEFENCE skill is +5 !!!-\n");
    }

    @Override
    public void Speed() {
        int sqSpd = getSpd();
        sqSpd += 5;
        setSpd(sqSpd);
        System.out.println("\n-----Learned <<" + getTech3() + ">>-----");
        System.out.println("-Your SPEED skill is +5 !!!-\n");
    }
}
