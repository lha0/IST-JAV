public class Charmander extends myCharacter implements Training {
    public Charmander (int Hp, int Atk, int Def, int Spd, int Eur) {
        setHp(Hp);
        setAtk(Atk);
        setDef(Def);
        setSpd(Spd);
        setEur(Eur);
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
        System.out.println("-----Learned \"" + getTech1() + "\"-----");
        System.out.println("-Your attack skill is +5-");
    }

    @Override
    public void Defence() {
        int Def_C = getDef();
        Def_C += 5;
        setDef(Def_C);
        System.out.println("-----Learned \"" + getTech2() + "\"-----");
         System.out.println("-Your defence skill is +5-");
    }

    @Override
    public void Speed() {
        int Spd_C = getSpd();
        Spd_C += 5;
        setSpd(Spd_C);
        System.out.println("-----Learned \"" + getTech3() + "\"-----");
        System.out.println("-Your speed skill is +5-");
    }
}
