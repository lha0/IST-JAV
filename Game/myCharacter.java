public abstract class myCharacter implements Training {
    private int Hp;
    private int Atk;
    private int Def;
    private int Spd;
    private int Eur;

    public int getHp() {
        return Hp;
    }

    public void setHp(int Hp) {
        this.Hp = Hp;
    }


    public int getAtk() {
        return Atk;
    }

    public void setAtk(int Atk) {
        this.Atk = Atk;
    }

    public int getDef() {
        return Def;
    }

    public void setDef(int Def) {
        this.Def = Def;
    }

    public int getSpd() {
        return Spd;
    }

    public void setSpd(int Spd) {
        this.Spd = Spd;
    }

    public int getEur() {
        return Eur;
    }

    public void setEur(int Eur) {
        this.Eur = Eur;
    }
    

    public void showStat() {
        System.out.println("--------------------");
        System.out.println("Hp : " + Hp);
        System.out.println("Attack : " + Atk);
        System.out.println("Defence : " + Def);
        System.out.println("Speed : " + Spd);
        System.out.println("Money : " + Eur);
        System.out.println("--------------------");
    }
}
