public abstract class myCharacter implements Training {
    private int Hp;
    private int Atk;
    private int Def;
    private int Spd;
    private int Eur;
    private int Ra;
    private int Level;
    private String Tech1;
    private String Tech2;
    private String Tech3;

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
    

    public int getRA() {
        return Ra;
    }

    public void setRA(int Ra) {
        this.Ra = Ra;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getTech1() {
        return Tech1;
    }

    public void setTech1(String Tech1) {
        this.Tech1 = Tech1;
    }

    public String getTech2() {
        return Tech2;
    }

    public void setTech2(String Tech2) {
        this.Tech2 = Tech2;
    }

    public String getTech3() {
        return Tech3;
    }

    public void setTech3(String Tech3) {
        this.Tech3 = Tech3;
    }

    public void showStat() {
        System.out.println("--------------------");
        System.out.println("Hp : " + Hp);
        System.out.println("Attack : " + Atk);
        System.out.println("Defence : " + Def);
        System.out.println("Speed : " + Spd);
        System.out.println("Money : " + Eur);
        System.out.println("Run Card : " + Ra);
        System.out.println("Level: " + Level);
        System.out.println("--------------------");
    }
}


