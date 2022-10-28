public class Charmander extends myCharacter implements Training {
    public Charmander (int Hp, int Atk, int Def, int Spd, int Eur, int Ra) {
        setHp(Hp);
        setAtk(Atk);
        setDef(Def);
        setSpd(Spd);
        setEur(Eur);
        setRA(Ra);
        setLevel(1);
        setTech1("Scratch");
        setTech2("Growl");
        setTech3("FlameThrower");

        System.out.println("Charmander has been chosen !");
    }

    @Override
    public void Attack() {
        int Atk_C = getAtk();
        Atk_C += 5;
        setAtk(Atk_C);
        System.out.println("\n-----Learned <<" + getTech1() + ">>-----");
        System.out.println("-Your ATTACK skill is +5 !!!-\n");
    }

    @Override
    public void Defence() {
        int Def_C = getDef();
        Def_C += 5;
        setDef(Def_C);
        System.out.println("\n-----Learned <<" + getTech2() + ">>-----");
         System.out.println("-Your DEFENCE skill is +5 !!!-\n");
    }

    @Override
    public void Speed() {
        int Spd_C = getSpd();
        Spd_C += 5;
        setSpd(Spd_C);
        System.out.println("\n-----Learned <<" + getTech3() + ">>-----");
        System.out.println("-Your SPEED skill is +5 !!!-\n");
    }
}
