public class Bulbasaur extends myCharacter implements Training {
    public Bulbasaur (int Hp, int Atk, int Def, int Spd, int Eur) {
        setHp(Hp);
        setAtk(Atk);
        setDef(Def);
        setSpd(Spd);
        setEur(Eur);
        setTech1("LeechSeed");
        setTech2("VineWhip");
        setTech3("Tackle");

        System.out.println("Bulbasaur has been chosen !");
    }

    @Override
    public void Attack() {
        int Atk_B = getAtk();
        Atk_B += 5;
        setAtk(Atk_B);
        System.out.println("\n-----Learned <<" + getTech1() + ">>-----");
        System.out.println("-Your ATTACK skill is +5 !!!-\n");
    }

    @Override
    public void Defence() {
        int Def_B = getDef();
        Def_B += 5;
        setDef(Def_B);
        System.out.println("\n-----Learned <<" + getTech2() + ">>-----");
        System.out.println("-Your DEFENCE skill is +5 !!!-\n");
    }

    @Override
    public void Speed() {
        int Spd_B = getSpd();
        Spd_B += 5;
        setSpd(Spd_B);
        System.out.println("\n-----Learned <<" + getTech3() + ">>-----");
        System.out.println("-Your SPEED skill is +5 !!!-\n");
    }
}

