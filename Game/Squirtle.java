public class Squirtle extends myCharacter implements Training {
    public Squirtle (int Hp, int Atk, int Def, int Spd, int Eur) {
        setHp(Hp);
        setAtk(Atk);
        setDef(Def);
        setSpd(Spd);
        setEur(Eur);
        setTech1("Tackle");
        setTech2("TailWhip");
        setTech3("WaterGun");

        System.out.println("Squirtle has been chosen !");
    }

    @Override
    public void Attack() {
        int Atk_S = getAtk();
        Atk_S += 5;
        setAtk(Atk_S);
        System.out.println("-----Learned \"" + getTech1() + "\"-----");
        System.out.println("-Your attack skill is +5-");
    }

    @Override
    public void Defence() {
        int Def_S = getDef();
        Def_S += 5;
        setDef(Def_S);
        System.out.println("-----Learned \"" + getTech2() + "\"-----");
        System.out.println("-Your defence skill is +5-");
    }

    @Override
    public void Speed() {
        int Spd_S = getSpd();
        Spd_S += 5;
        setSpd(Spd_S);
        System.out.println("-----Learned \"" + getTech3() + "\"-----");
        System.out.println("-Your speed skill is +5-");
    }
}
