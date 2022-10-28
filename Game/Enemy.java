public class Enemy {
    private int Hp_E;
    private int Atk_E;
    private int Def_E;
    private int Spd_E;

    public int getHp() {
        return Hp_E;
    }

    public void setHp(int Hp_E) {
        this.Hp_E = Hp_E;
    }

    public int getAtk() {
        return Atk_E;
    }

    public void setAtk(int Atk_E) {
        this.Atk_E = Atk_E;
    }

    public int getDef() {
        return Def_E;
    }

    public void setDef(int Def_E) {
        this.Def_E = Def_E;
    }

    public int getSpd() {
        return Spd_E;
    }

    public void setSpd(int Spd_E) {
        this.Spd_E = Spd_E;
    }

    public Enemy (int Hp_E, int Atk_E, int Def_E, int Spd_E) {
        setHp(Hp_E);
        setAtk(Atk_E);
        setDef(Def_E);
        setSpd(Spd_E);
    }

    public void showStat_enemy() {
        System.out.println("--------------------");
        System.out.println("Attack : " + getAtk());
        System.out.println("Defence : " + getDef());
        System.out.println("Speed : " + getSpd());
        System.out.println("--------------------");
    }
    
}
