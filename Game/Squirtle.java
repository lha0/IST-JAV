public class Squirtle extends myCharacter implements Training {
    public Squirtle (int Hp, int Atk, int Def, int Spd, int Eur, int Ra) {
        setHp(Hp);
        setAtk(Atk);
        setDef(Def);
        setSpd(Spd);
        setEur(Eur);
        setRA(Ra);
        setLevel(1);
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
        System.out.println("\n-----Learned <<" + getTech1() + ">>-----");
        System.out.println("-Your ATTACK skill is +5 !!!-\n");
    }

    @Override
    public void Defence() {
        int Def_S = getDef();
        Def_S += 5;
        setDef(Def_S);
        System.out.println("\n-----Learned <<" + getTech2() + ">>-----");
        System.out.println("-Your DEFENCE skill is +5 !!!-\n");
    }

    @Override
    public void Speed() {
        int Spd_S = getSpd();
        Spd_S += 5;
        setSpd(Spd_S);
        System.out.println("\n-----Learned <<" + getTech3() + ">>-----");
        System.out.println("-Your SPEED skill is +5 !!!-\n");
    }
}
