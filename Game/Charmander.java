public class Charmander extends myCharacter implements Training {   //Inherited from abstract class 'myCharacter' and interface 'Training'
    //Constructor
    public Charmander(int hp, int atk, int def, int spd, int eur, int runCard) {
        setHp(hp);
        setAtk(atk);
        setDef(def);
        setSpd(spd);
        setEur(eur);
        setRA(runCard);
        setLevel(1);
        setTech1("Scratch");
        setTech2("Growl");
        setTech3("FlameThrower");

        System.out.println(">> Charmander has been chosen !\n");
    }

    //Implementing functions in interface 'Training'
    @Override
    public void Attack() {
        int cmAtk = getAtk();
        cmAtk += 5;
        setAtk(cmAtk);
        System.out.println("\n-----Learned <<" + getTech1() + ">>-----");
        System.out.println("-Your ATTACK skill is +5 !!!-\n");
    }

    @Override
    public void Defence() {
        int cmDef = getDef();
        cmDef += 5;
        setDef(cmDef);
        System.out.println("\n-----Learned <<" + getTech2() + ">>-----");
         System.out.println("-Your DEFENCE skill is +5 !!!-\n");
    }

    @Override
    public void Speed() {
        int cmSpd = getSpd();
        cmSpd += 5;
        setSpd(cmSpd);
        System.out.println("\n-----Learned <<" + getTech3() + ">>-----");
        System.out.println("-Your SPEED skill is +5 !!!-\n");
    }
}
