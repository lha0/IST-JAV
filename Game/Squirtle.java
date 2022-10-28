public class Squirtle extends myCharacter implements Training {
    
    int Hp_S = getHp();
    int Atk_S = getAtk();
    int Def_S = getDef();
    int Spd_S = getSpd();
    int Eur_S = getEur();

    
    public Squirtle (int Hp, int Def, int Atk, int Spd, int Eur) {
        setHp(Hp);
        setAtk(Atk);
        setDef(Def);
        setSpd(Spd);
        setEur(Eur);

        System.out.println("Squirtle has been chosen !");
    }

    @Override
    public void Attack() {
         Atk_S += 5;
         setAtk(Atk_S);
         System.out.println("Attack + 5 !");
         return;
    }

    @Override
    public void Defence() {
        Def_S += 5;
        setDef(Def_S);
        System.out.println("Defence + 5 !");
        return;
    }

    @Override
    public void Speed() {
        Spd_S += 5;
        setSpd(Spd_S);
        System.out.println("Speed + 5 !");
        return;
    }
}
